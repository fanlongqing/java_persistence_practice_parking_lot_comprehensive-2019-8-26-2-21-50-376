package tws.entity;

public class ParkingLot {
    private String parkingLotID;
    private int capacity;

    public String getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(String parkingLotID) {
        this.parkingLotID = parkingLotID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLot(String parkingLotID, int capacity) {
        this.parkingLotID = parkingLotID;
        this.capacity = capacity;
    }

    public ParkingLot() {
    }
}
