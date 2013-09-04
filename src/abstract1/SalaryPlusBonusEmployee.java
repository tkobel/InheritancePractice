package abstract1;

public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double weeklyBonus;
    
    public SalaryPlusBonusEmployee(String id, String n, String pos, int age,
                                   double sal, double bon){
        super(id, n, pos, age, sal);
        weeklyBonus = bon;
    }
    
    @Override
    public double calcPaycheck(){
        return super.getSalary()/52 + weeklyBonus;
    }
}
