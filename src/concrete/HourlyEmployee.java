package concrete;

public class HourlyEmployee extends Employee {
    private double payRate, hours;
    
    public HourlyEmployee(String id, String n, String pos, 
            double rate, double hrs){
    super(id, n, pos);
    payRate = rate;
    hours = hrs;}
     
}
