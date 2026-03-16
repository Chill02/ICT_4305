package parkingstructure.com;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TransactionManager {

    private final List<ParkingCharge> charges = new ArrayList<>();
    private final HashMap<String, List<ParkingCharge>> byPermit = new HashMap<>();

    public ParkingCharge recordCharge(ParkingPermit permit, ParkingLot lot, Money amount) {

        ParkingCharge charge = new ParkingCharge(
                permit.getId(),
                lot.getLotId(),
                Instant.now(),
                amount
        );

        charges.add(charge);

        byPermit.computeIfAbsent(permit.getId(), k -> new ArrayList<>())
                .add(charge);

        return charge;
    }

    public List<ParkingCharge> getChargesForPermit(String permitId) {
        return byPermit.getOrDefault(permitId, List.of());
    }

    public List<ParkingCharge> getAllCharges() {
        return charges;
    }
}


