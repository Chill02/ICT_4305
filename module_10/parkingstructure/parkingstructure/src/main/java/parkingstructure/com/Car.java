package parkingstructure.com;

public class Car {

    private final String license;
    private final CarType type;
    private final String ownerId;
    private ParkingPermit permit;  // Assigned by PermitManager

    public Car(String license, CarType type, String ownerId) {
        this.license = license;
        this.type = type;
        this.ownerId = ownerId;
    }

    public String getLicense() {
        return license;
    }

    public CarType getType() {
        return type;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public ParkingPermit getPermit() {
        return permit;
    }

    public void assignPermit(ParkingPermit permit) {
        this.permit = permit;
    }

    @Override
    public String toString() {
        return "Car{license='" + license + "', type=" + type +
                ", ownerId='" + ownerId + "', permit=" +
                (permit != null ? permit.getId() : "NONE") + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car other = (Car) o;
        return license.equalsIgnoreCase(other.license);
    }

    @Override
    public int hashCode() {
        return license.toLowerCase().hashCode();
    }
}
