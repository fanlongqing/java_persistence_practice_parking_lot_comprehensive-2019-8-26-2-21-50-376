package tws.entity;

public class ParkingBoy{
    private  String employeeID;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public ParkingBoy() {
    }

    public ParkingBoy(String employeeID, String name, int age) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
    }
}
