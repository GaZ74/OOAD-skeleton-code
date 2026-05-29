package ooad.ucex02;

import java.util.List;

public class ExtensionModel {
    private final Database database;

    public ExtensionModel(Database database) {
        this.database = database;
    }

    public List<PendingExtensionRequest> fetchPendingReservations() {
        return database.queryPendingReservations();
    }
}
