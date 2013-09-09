package interface1;

public class SalaryPlusBonusEmployee implements IEmployee{
    private String employeeId, name, position;
    private int age;
    private double yearlySalary, weeklyBonus;
    
    public SalaryPlusBonusEmployee(String employeeId, String name, String position, int age,
                                   double yearlySalary, double weeklyBonus){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.age = age;
        this.yearlySalary = yearlySalary;
        this.weeklyBonus = weeklyBonus;
    }

    public double getBonus() {
        return weeklyBonus;
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
        return yearlySalary/52 + weeklyBonus;
    }
}
