import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws Exception {
        CsvAdapter csv = new CsvAdapter();
        ArrayList<String[]> result = csv.Reader();
        ArrayList<Employee> object = ClassCreator.Parse(new ArrayList<Employee>(),result);
        Serializer serializer = new Serializer();
        serializer.Serialization(object,"file.ser");
        Serializer desirealizer = new Serializer();
        ArrayList<Employee> writer = desirealizer.Deserialaze("file.ser");
        for (Employee employee:writer){
            employee.PrintInfo();
        }
    }
}
