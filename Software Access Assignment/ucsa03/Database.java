package ooad.ucsa03;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<SoftwareRequest> queryPendingRequests(boolean simulateError) throws DatabaseException {
        if (simulateError) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        List<SoftwareRequest> requests = new ArrayList<>();
        requests.add(new SoftwareRequest("SA-001", "U-001", "SW-001", "PENDING"));
        requests.add(new SoftwareRequest("SA-002", "U-002", "SW-003", "PENDING"));

        return requests;
    }
}
