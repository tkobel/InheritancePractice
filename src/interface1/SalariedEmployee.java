package interface1;

public class SalariedEmployee implements IEmployee {
    private String empId, name, position;
    private int age;
    private double salary;
    
    public SalariedEmployee(String id, String n, String pos, int age, double sal){
        empId = id;
        name = n;
        position = pos;
        this.age = age;
        salary = sal;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Employee No.: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
    
    @Override
    public double calcPaycheck(){
        return salary / 52;
    }
}
