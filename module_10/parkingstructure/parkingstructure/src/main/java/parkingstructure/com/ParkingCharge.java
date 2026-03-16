package parkingstructure.com;

import java.time.Instant;
import java.util.Objects;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkingCharge)) return false;
        ParkingCharge that = (ParkingCharge) o;
        return Objects.equals(permitId, that.permitId) &&
                Objects.equals(incurred, that.incurred);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permitId, incurred);
    }


}

