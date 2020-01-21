package payrollsystem;

public abstract class Employee {
    // class variables
    private int empID;
    private String name;
    private Vehicle vehicle;

    // class constructor
    public Employee() {
        // default constructor with zero parameters
        System.out.println(".. inside default constructor");
        empID = 0;
        name = "";
    }

    public Employee(int pEmpID, String pName, Vehicle pV) {
        // a non-default constructor with at least 1 parameter
        System.out.println(".. inside Employee non-default constructor");
        empID = pEmpID;
        name = pName;
        this.vehicle = pV; // pV must have been previously created in the calling env
    }

    public Employee(int pEmpID, String pName, String pPlate, String pColour) {
        // a non-default constructor with at least 1 parameter
        System.out.println(".. inside Employee non-default constructor");
        empID = pEmpID;
        name = pName;
        this.vehicle = new Vehicle(pPlate, pColour); // pV must have been previously created in the calling env
    }

    public abstract double calculatePay();

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

