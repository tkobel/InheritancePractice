package abstract1;

public abstract class Employee {
    private String employeeId, name, position;
    private int age;
    
    public Employee(String employeeId, String name, String position, int age){
    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
    this.age = age;
  
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }
    public void displayInfo(){
        System.out.println("Employee No.: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }
    public abstract double calculatePaycheck();
}
