package parkingstructure.com;

import java.time.Instant;

public class ParkingCharge {

    private String permitId;
    private String lotId;
    private Instant incurred;
    private Money amount;

    public ParkingCharge(String permitId, String lotId, Instant incurred, Money amount) {
        this.permitId = permitId;
        this.lotId = lotId;
        this.incurred = incurred;
        this.amount = amount;
    }

    public String getPermitId() {
        return permitId;
    }

    public String getLotId() {
        return lotId;
    }

    public Instant getIncurred() {
        return incurred;
    }

    public Money getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "ParkingCharge[" +
                "permitId='" + permitId + '\'' +
                ", lotId='" + lotId + '\'' +
                ", incurred=" + incurred +
                ", amount=" + amount +
                ']';
    }
}

