package ooad.ucsa03;

import java.util.List;

public class SoftwareModel {
    private Database database;

    public SoftwareModel(Database database) {
        this.database = database;
    }

    public List<SoftwareRequest> fetchPendingRequests(boolean simulateError) throws DatabaseException {
        return database.queryPendingRequests(simulateError);
    }
}
