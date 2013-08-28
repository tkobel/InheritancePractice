package interface1;

public class HourlyEmployee implements IEmployee{
    private String empId, name, position;
    private int age;
    private double payRate, hours;
    
    
    
    public HourlyEmployee(String id, String n, String pos, int age,
            double rate, double hrs){
        empId = id;
        name = n;
        position = pos;
        this.age = age;
        payRate = rate;
        hours = hrs;        
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Employee No.: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Pay rate: " + payRate);     
    }
    
    @Override
    public double calcPaycheck(){
        double paycheck = 0;
        if(hours>40)
        {
            paycheck += (hours - 40) * payRate/2;
        }
        return paycheck += hours*payRate;   
    }
}
