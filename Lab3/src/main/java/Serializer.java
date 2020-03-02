import java.io.*;
import java.util.ArrayList;

public class Serializer {
    public void Serialization(ArrayList<Employee> fileData, String pathToTheFile) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(pathToTheFile);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(fileData);
        objectOutputStream.close();
    }
    public ArrayList<Employee> Deserialaze(String downloadFilePath) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(downloadFilePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (ArrayList<Employee>) objectInputStream.readObject();
    }
}
