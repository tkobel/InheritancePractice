package concrete;

public class SalariedEmployee extends Employee{
    private double salary;
    
    public SalariedEmployee(String id, String n, String pos, int age, double sal){
        super(id, n, pos, age);
        salary = sal;
    }
    
    public double calcPaycheck(){
    return salary/52;
    }

    public double getSalary() {
        return salary;
    }
    
}
