package interface1;

public class SalaryPlusBonusEmployee implements IEmployee{
    private String empId, name, position;
    private int age;
    private double salary, bonus;
    
    public SalaryPlusBonusEmployee(String id, String n, String pos, int age,
                                   double sal, double bon){
        empId = id;
        name = n;
        position = pos;
        this.age = age;
        salary = sal;
        bonus = bon;
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
        return salary/52 + bonus;
    }
}
