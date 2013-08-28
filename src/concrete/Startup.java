package concrete;

import java.text.DecimalFormat;

public class Startup {
    public static void main(String[] args)
    {
        DecimalFormat dollar = new DecimalFormat("$###,###,###.00");
        
        HourlyEmployee emp1 = new HourlyEmployee("001", "Stan Smith", "Janitor", 44, 19, 35);
        SalariedEmployee emp2 = new SalariedEmployee("002", "Sue Jackson", "accountant", 30, 35000);
        SalaryPlusBonusEmployee emp3 = new SalaryPlusBonusEmployee("003", "Jeff Johnson", "CEO", 61, 100000, 3000);
        
    }
    
}
