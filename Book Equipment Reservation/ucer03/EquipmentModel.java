package ooad.ucer03;

import java.util.List;

public class EquipmentModel {
    private final Database database;

    public EquipmentModel(Database database) {
        this.database = database;
    }

    public List<PendingReservation> fetchPendingReservations() {
        return database.queryPendingReservations();
    }
}
