package interface1;

public class SalariedEmployee implements IEmployee {
    private String employeeId, name, position;
    private int age;
    private double yearlySalary;
    
    public SalariedEmployee(String employeeId, String name, String position,
                            int age, double yearlySalary){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.age = age;
        this.yearlySalary = yearlySalary;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Employee No.: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
    
    @Override
    public double calculatePaycheck(){
        return yearlySalary / 52;
    }
}
