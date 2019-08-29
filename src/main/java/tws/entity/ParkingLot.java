package tws.entity;

public class ParkingLot {
    private String parkingLotID;
    private int capacity;
    private String parkingBoyId;

    public String getParkingLotID() {
        return parkingLotID;
    }

    public String getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(String parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
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

    public ParkingLot(String parkingLotID, int capacity, String parkingBoyId) {
        this.parkingLotID = parkingLotID;
        this.capacity = capacity;
        this.parkingBoyId = parkingBoyId;
    }

    public ParkingLot() {
    }
}
