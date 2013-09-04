package concrete;

import java.text.DecimalFormat;

public class Startup {
    public static void main(String[] args)
    {
DecimalFormat dollar = new DecimalFormat("$###,###,###.00");
        
        HourlyEmployee emp1 = new HourlyEmployee("001", "Stan Smith", "Janitor", 44, 19, 35);
        emp1.displayInfo();
        System.out.println("Pay rate: " + dollar.format(emp1.getPayRate()) + "/hr" );
        System.out.println("Hours worked: " + emp1.getHours());
        System.out.println("Weekly pay: " + dollar.format(emp1.calcPaycheck()));
        System.out.println();
        
        SalariedEmployee emp2 = new SalariedEmployee("002", "Sue Jackson", "Accountant", 30, 35000);
        emp2.displayInfo();
        System.out.println("Salary: " + dollar.format(emp2.getSalary()));
        System.out.println("Weekly pay: " + dollar.format(emp2.calcPaycheck()));
        System.out.println();
        
        SalaryPlusBonusEmployee emp3 = new SalaryPlusBonusEmployee("003", "Jeff Johnson", "CEO", 61, 100000, 3000);
        emp3.displayInfo();
        System.out.println("Salary: " + dollar.format(emp3.getSalary()));
        System.out.println("Weekly pay: " + dollar.format(emp3.calcPaycheck()));
        System.out.println();
    }
    
}
