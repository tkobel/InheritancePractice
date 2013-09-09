package abstract1;

public class HourlyEmployee extends Employee {

    private double hourlyWage, hoursWorked;

    public HourlyEmployee(String employeeId, String name, String position, int age,
            double hourlyWage, double hoursWorked) {
        super(employeeId, name, position, age);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculatePaycheck() {
        double paycheckAmount = 0;
        if (hoursWorked > 40) {
            paycheckAmount += (hoursWorked - 40) * hourlyWage / 2;
        }
        return paycheckAmount += hoursWorked * hourlyWage;
    }
}
