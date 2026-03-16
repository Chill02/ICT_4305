package parkingstructure.com;

import java.util.Calendar;

public class ParkingTransaction {

    private final Calendar transactionDate;
    private final ParkingPermit permit;
    private final ParkingLot lot;
    private final Money feeCharged;

    public ParkingTransaction(Calendar transactionDate,
                              ParkingPermit permit,
                              ParkingLot lot,
                              Money feeCharged) {
        this.transactionDate = transactionDate;
        this.permit = permit;
        this.lot = lot;
        this.feeCharged = feeCharged;
    }

    public Calendar getTransactionDate() {
        return transactionDate;
    }

    public ParkingPermit getPermit() {
        return permit;
    }

    public ParkingLot getLot() {
        return lot;
    }

    public Money getFeeCharged() {
        return feeCharged;
    }

    @Override
    public String toString() {
        return "ParkingTransaction{" +
                "date=" + transactionDate.getTime() +
                ", permit=" + permit.getId() +
                ", lot=" + lot.getLotId() +
                ", fee=" + feeCharged +
                '}';
    }
}

