package concrete;

public class Employee {
    private String empId, name, position;
    private int age;
    
    public Employee(String id, String n, String pos){
    empId = id;
    name = n;
    position = pos;
    }

    public String getEmpId() {
        return empId;
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
}
