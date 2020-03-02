public class Staffer extends Employee {
    public Staffer(String[] alldata){
        this.typeEmployee = alldata[0];
        this.firstName = alldata[1];
        this.secondName = alldata[2];
        this.salary = Integer.valueOf(alldata[3]);
        this.hours = Integer.valueOf(alldata[4]);
        this.department = alldata[5];
    }

    @Override
    public void PrintInfo() {
        System.out.println();
        System.out.println("Type Employee: " + typeEmployee);
        System.out.println("First name: "+firstName);
        System.out.println("Second name: "+secondName);
        System.out.println("Salary: "+salary);
        System.out.println("Hours: "+hours);
        System.out.println("Department: "+department);
        System.out.println("__________________________");
    }
}
