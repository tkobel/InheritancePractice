package interface1;

public class HourlyEmployee implements IEmployee{
    private String employeeId, name, position;
    private int age;
    private double hourlyWage, hoursWorked;
    
    
    
    public HourlyEmployee(String employeeId, String name, String position, int age,
            double hourlyWage, double hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.age = age;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;        
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Employee No.: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Pay rate: " + hourlyWage);     
    }
    
    @Override
    public double calculatePaycheck(){
        double paycheck = 0;
        if(hoursWorked>40)
        {
            paycheck += (hoursWorked - 40) * hourlyWage/2;
        }
        return paycheck += hoursWorked*hourlyWage;   
    }
}
