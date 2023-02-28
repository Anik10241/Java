public class Main {
    public static void main(String[] args){
        Employee e1=new Employee("Anik Podder",5093,12000.45);
        e1.setName("Anik Podder");
        e1.setId(5093);
        e1.setSalary(12000.45);
        e1.age=23;
        System.out.println(e1.getName());
        System.out.println(e1.getId());
        System.out.println(e1.getSalary());
        System.out.println(e1.age);
    }
}