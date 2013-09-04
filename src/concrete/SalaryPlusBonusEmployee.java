package concrete;

public class SalaryPlusBonusEmployee extends SalariedEmployee{
    double bonus;
    public SalaryPlusBonusEmployee(String id, String n, String pos, int age,
                                   double sal, double bon){
        super(id, n, pos, age, sal);
        bonus = bon;
    }

    public double getBonus() {
        return bonus;
    }
    
 
    @Override
    public double calcPaycheck(){
        return super.getSalary()/52 + bonus;
    }
}
