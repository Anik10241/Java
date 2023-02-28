public class Employee {
    private double salary;
    private String name;

    public Employee(){
        this.name="Anik Podder";
        this.salary=120000.45;
    }
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;

    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String args[]){
        Employee e1=new Employee("Anik Podder",120000.45);
        System.out.println("Name: "+e1.getName());
        System.out.println("Salary: "+e1.getSalary());
    }
}
