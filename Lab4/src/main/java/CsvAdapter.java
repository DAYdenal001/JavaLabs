import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CsvAdapter {
    public static ArrayList<String[]> Reader() throws Exception
    {
        ArrayList<String []> data = new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader("data.csv"), ';' , '\0' , 0);
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                data.add(nextLine);
            }
        }
        return data;
    }
}
