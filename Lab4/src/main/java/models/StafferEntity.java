package models;

import javax.persistence.*;

@Entity
@Table(name = "staffer", schema = "public", catalog = "lab4")
public class StafferEntity {
    private int id;
    private String typeemployee;
    private String firstname;
    private String secondname;
    private Integer salary;
    private Integer hours;
    private String department;

    public StafferEntity(){}

    public StafferEntity(String[] allParameters){
        CreateFromText(allParameters);
    }

    private void CreateFromText(String[] allParameters) {
        this.typeemployee = allParameters[0];
        this.firstname = allParameters[1];
        this.secondname = allParameters[2];
        this.salary = Integer.parseInt(allParameters[3]);
        this.hours = Integer.parseInt(allParameters[4]);
        this.department = allParameters[5];
    }

    public void PrintInfo() {
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println("Type Employee: " + typeemployee);
        System.out.println("First name: "+ firstname);
        System.out.println("Second name: "+ secondname);
        System.out.println("Salary: "+ salary);
        System.out.println("Hours: "+ hours);
        System.out.println("Department: "+ department);
        System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "typeemployee", nullable = true, length = 50)
    public String getTypeemployee() {
        return typeemployee;
    }

    public void setTypeemployee(String typeemployee) {
        this.typeemployee = typeemployee;
    }

    @Basic
    @Column(name = "firstname", nullable = true, length = 50)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "secondname", nullable = true, length = 50)
    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Basic
    @Column(name = "salary", nullable = true)
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "hours", nullable = true)
    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Basic
    @Column(name = "department", nullable = true, length = 50)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StafferEntity that = (StafferEntity) o;

        if (id != that.id) return false;
        if (typeemployee != null ? !typeemployee.equals(that.typeemployee) : that.typeemployee != null) return false;
        if (firstname != null ? !firstname.equals(that.firstname) : that.firstname != null) return false;
        if (secondname != null ? !secondname.equals(that.secondname) : that.secondname != null) return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (hours != null ? !hours.equals(that.hours) : that.hours != null) return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (typeemployee != null ? typeemployee.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (secondname != null ? secondname.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (hours != null ? hours.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }


}
