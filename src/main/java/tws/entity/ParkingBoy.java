package tws.entity;

public class ParkingBoy{
    private  String employeeID;
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
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

    public ParkingBoy(String employeeID, String name, String age) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
    }
}
