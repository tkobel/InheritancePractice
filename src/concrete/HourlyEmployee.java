package concrete;

public class HourlyEmployee extends Employee {
    private double payRate, hours;
    
    public HourlyEmployee(String id, String n, String pos, int age,
            double rate, double hrs){
    super(id, n, pos, age);
    payRate = rate;
    hours = hrs;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHours() {
        return hours;
    }
    
    public double calcPaycheck(){
        double paycheck = 0;
        if(hours>40)
        {
            paycheck += (hours - 40) * payRate/2;
        }
        return paycheck += hours*payRate;        
    }
     
}
