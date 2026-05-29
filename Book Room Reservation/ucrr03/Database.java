package ooad.ucrr03;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public List<PendingReservation> queryPendingReservations() {
        List<PendingReservation> reservationList = new ArrayList<>();
        reservationList.add(new PendingReservation("PR-003-001", "RM-201", "USR-1001"));
        reservationList.add(new PendingReservation("PR-003-002", "RM-202", "USR-1002"));
        return reservationList;
    }
}
