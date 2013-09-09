package concrete;

public class SalariedEmployee extends Employee{
    private double yearlySalary;
    
    public SalariedEmployee(String employeeId, String name, String position, int age, double yearlySalary){
        super(employeeId, name, position, age);
        this.yearlySalary = yearlySalary;
    }
    
    public double calculatePaycheck(){
    return yearlySalary/52;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }   
}
