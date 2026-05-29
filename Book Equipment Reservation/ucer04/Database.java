package ooad.ucer04;

public class Database {

    public ResourceValue getResourceValue(String reservationId) {
        // Skeleton behavior for demo/testing.
        if ("RES-HIGH".equalsIgnoreCase(reservationId)) {
            return new ResourceValue(reservationId, 15000.00);
        }

        return new ResourceValue(reservationId, 2500.00);
    }
}
