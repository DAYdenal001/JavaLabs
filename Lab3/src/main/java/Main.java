import org.javatuples.Pair;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception {
        CsvAdapter csv = new CsvAdapter();
        ArrayList<String[]> result = csv.Reader();
        ArrayList<Employee> object = ClassCreator.Parse(new ArrayList<Employee>(),result);
        ArrayList<Pair<String, String>> dataForDatabase = new ArrayList<Pair<String, String>>();
        for (Employee employee:object){
            employee.PrintInfo();
            dataForDatabase.add(DatabaseDataPreparer.PrepearData(employee));
        }
        DatabaseMediator databaseMediator = new DatabaseMediator();
        if (databaseMediator.Connect("postgresql", "lab3", "postgres", "admin"))
        {
            for (int i = 0; i < object.size(); i++)
            {
                databaseMediator.Insert(object.get(i).TakeClassName(),
                        dataForDatabase.get(i).getValue0(),
                        dataForDatabase.get(i).getValue1());
            }
            databaseMediator.Disconnect();
        }
    }
}
