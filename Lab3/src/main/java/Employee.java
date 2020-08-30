import java.io.Serializable;

public abstract class Employee implements Serializable {
   public String typeEmployee;
   public String firstName;
   public String secondName;
   public int salary;
   public int hours;
   public String department;

   public void PrintInfo(){ };
   public String TakeClassName(){return this.getClass().getSimpleName();};
}
