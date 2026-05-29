package ooad.ucrr03;

import java.util.List;

public class RoomModel {
    private final Database database;

    public RoomModel(Database database) {
        this.database = database;
    }

    public List<PendingReservation> fetchPendingReservations() {
        return database.queryPendingReservations();
    }
}
