package parkingstructure.com;

import java.util.HashMap;
import java.util.UUID;

public class PermitManager {

    private final HashMap<String, ParkingPermit> permits = new HashMap<>();

    public ParkingPermit register(Car car) {
        String id = "PERMIT-" + UUID.randomUUID().toString().substring(0, 8);
        ParkingPermit permit = new ParkingPermit(id, car);
        permits.put(id, permit);
        return permit;
    }

    public ParkingPermit getPermit(String id) {
        return permits.get(id);
    }
}



