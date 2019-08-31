package tws.entity;

public class ParkingLot {
    private String parkingLotID;
    private int capacity;
    private String parkingBoyId;
    private int availablePositionCount;

    public int getAvailablePositionCount() {
        return availablePositionCount;
    }

    public void setAvailablePositionCount(int availablePositionCount) {
        this.availablePositionCount = availablePositionCount;
    }

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

    public ParkingLot(String parkingLotID, int capacity, String parkingBoyId,int availablePositionCount) {
        this.parkingLotID = parkingLotID;
        this.capacity = capacity;
        this.parkingBoyId = parkingBoyId;
        this.availablePositionCount = availablePositionCount;
    }

    public ParkingLot() {
    }
}
