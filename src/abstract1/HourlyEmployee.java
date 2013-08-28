package abstract1;

public class HourlyEmployee extends Employee{
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
    public double calcPaycheck(){
        double paycheck = 0;
        if(hours>40)
        {
            paycheck += (hours - 40) * payRate/2;
        }
        return paycheck += hours*payRate;   
    }
    
}
