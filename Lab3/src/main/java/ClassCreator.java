import java.util.ArrayList;

public class ClassCreator {
    static public ArrayList<Employee> Parse(ArrayList<Employee> allFinalTests,  ArrayList<String []> allData)
    {
        for (String[] examData:allData)
        {
            if(examData[0].contains("Staffer"))
                allFinalTests.add(new Staffer(examData));
            else
            if(examData[0].contains("Assistant"))
                allFinalTests.add(new Assistant(examData));
        }
        return allFinalTests;
    }
}
