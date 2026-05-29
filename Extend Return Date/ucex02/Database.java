package ooad.ucex02;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public List<PendingExtensionRequest> queryPendingReservations() {
        List<PendingExtensionRequest> reservationList = new ArrayList<>();
        reservationList.add(new PendingExtensionRequest("ER-PEND-001", "RS-700", "USR-1001"));
        reservationList.add(new PendingExtensionRequest("ER-PEND-002", "RS-701", "USR-1002"));
        return reservationList;
    }
}
