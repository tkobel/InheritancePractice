package interface1;

import java.text.DecimalFormat;

public class Startup {
    public static void main(String[] args){
        DecimalFormat dollar = new DecimalFormat("$###,###,###.00");
        
        HourlyEmployee emp1 = new HourlyEmployee("221", "Joe Smith", "Doorman", 19, 15.50, 45);
        emp1.displayInfo();
        System.out.println("Weekly pay: " + dollar.format(emp1.calcPaycheck()));
        System.out.println();
        
        SalariedEmployee emp2 = new SalariedEmployee("222", "Jane Peterson", "Secretary", 25, 63000);
        emp2.displayInfo();
        System.out.println("Weekly pay: " + dollar.format(emp2.calcPaycheck()));
        System.out.println();
        
        SalaryPlusBonusEmployee emp3 = new SalaryPlusBonusEmployee("223", "Bill Cole", "President", 45, 150000, 1000);
        emp3.displayInfo();
        System.out.println("Weekly bonus: " + dollar.format(emp3.getBonus()));
        System.out.println("Weekly pay: " + dollar.format(emp3.calcPaycheck()));
        System.out.println();
    }
}
