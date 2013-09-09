package abstract1;

public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double weeklyBonus;
    
    public SalaryPlusBonusEmployee(String employeeId, String name, String position, int age,
                                   double yearlySalary, double weeklyBonus){
        super(employeeId, name, position, age, yearlySalary);
        this.weeklyBonus = weeklyBonus;
    }

    public double getWeeklyBonus() {
        return weeklyBonus;
    }

    @Override
    public double calculatePaycheck(){
        return super.getYearlySalary()/52 + weeklyBonus;
    }
}
