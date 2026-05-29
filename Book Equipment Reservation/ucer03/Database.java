package ooad.ucer03;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public List<PendingReservation> queryPendingReservations() {
        // Skeleton data for demo/testing.
        List<PendingReservation> reservationList = new ArrayList<>();
        reservationList.add(new PendingReservation("RES-1001", "U-001", "R-101", "2026-06-01", "PENDING"));
        reservationList.add(new PendingReservation("RES-1002", "U-002", "R-203", "2026-06-02", "PENDING"));
        return reservationList;
    }
}
