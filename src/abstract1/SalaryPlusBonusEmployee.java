package abstract1;

public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double bonus;
    
    public SalaryPlusBonusEmployee(String id, String n, String pos, int age,
                                   double sal, double bon){
        super(id, n, pos, age, sal);
        bonus = bon;
    }

    public double getWeeklyBonus() {
        return bonus;
    }

    @Override
    public double calcPaycheck(){
        return super.getSalary()/52 + bonus;
    }
}
