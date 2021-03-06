package payrollsystem;

public class Vehicle {
    private String plateNumber;
    private String colour;

    public Vehicle(String plateNumber, String colour) {
        this.setPlateNumber(plateNumber);
        this.setColour(colour);
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
