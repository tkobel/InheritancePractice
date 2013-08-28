package concrete;

public class SalariedEmployee extends Employee{
    private double salary;
    
    public SalariedEmployee(String id, String n, String pos, double sal){
        super(id, n, pos);
        salary = sal;
    }
    
}
