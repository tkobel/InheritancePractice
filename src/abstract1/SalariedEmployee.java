package abstract1;

public class SalariedEmployee extends Employee{
    private double yearlySalary;
    
    public SalariedEmployee(String employeeId, String name, String position, int age, double yearlySalary){
    super(employeeId, name, position, age);
    this.yearlySalary = yearlySalary;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    @Override
    public double calculatePaycheck(){
        return yearlySalary/52;
    }
}
