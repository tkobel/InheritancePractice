package abstract1;

import java.text.DecimalFormat;

public class Startup {

    public static void main(String[] args) {
        DecimalFormat dollar = new DecimalFormat("$###,###,###.00");

        HourlyEmployee emp1 = new HourlyEmployee("301", "Steve Stevenson", "Cashier", 17, 10, 25);
        emp1.displayInfo();
        System.out.println("Pay rate: " + dollar.format(emp1.getHourlyWage()) + "/hr");
        System.out.println("Hours worked: " + emp1.getHoursWorked());
        System.out.println("Weekly pay: " + dollar.format(emp1.calculatePaycheck()));
        System.out.println();

        SalariedEmployee emp2 = new SalariedEmployee("302", "Mark Phillips", "Programmer",
                39, 45990);
        emp2.displayInfo();
        System.out.println("Salary: " + dollar.format(emp2.getYearlySalary()));
        System.out.println("Weekly pay: " + dollar.format(emp2.calculatePaycheck()));
        System.out.println();

        SalaryPlusBonusEmployee emp3 = new SalaryPlusBonusEmployee("303", "Sally Simpson", "Manager", 44, 50505, 370);
        emp3.displayInfo();
        System.out.println("Salary: " + dollar.format(emp3.getYearlySalary()));
        System.out.println("Weekly bonus amount: " + dollar.format(emp3.getWeeklyBonus()));
        System.out.println("Weekly pay: " + dollar.format(emp3.calculatePaycheck()));
        System.out.println();
    }
}
