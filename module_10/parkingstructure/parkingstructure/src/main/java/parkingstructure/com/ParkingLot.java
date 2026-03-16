package parkingstructure.com;



// Class to represent a Parking lot
public class ParkingLot {

    private final String lotId;
    private final Address address;
    private final Money rate;

    public ParkingLot(String lotId, Address address, Money rate) {
        this.lotId = lotId;
        this.address = address;
        this.rate = rate;
    }

    public Money getRate() {
        return rate;
    }

    public String getLotId() {
        return lotId;
    }

    public Money entry(Car car) {
        return rate; // simple flat fee
    }
}

