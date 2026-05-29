package ooad.ucsa01;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public List<SoftwareResource> queryAvailableResources(SoftwareSearchCriteria criteria) throws DatabaseException {
        if (criteria.getSoftwareType() == null || criteria.getSoftwareType().isBlank()) {
            throw new DatabaseException("Invalid search criteria: software type is required.");
        }

        if ("DB_ERROR".equalsIgnoreCase(criteria.getSoftwareType())) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        List<SoftwareResource> resources = new ArrayList<>();

        if ("IDE".equalsIgnoreCase(criteria.getSoftwareType()) && criteria.getLicenseCount() <= 5) {
            resources.add(new SoftwareResource("SW-301", "IntelliJ IDEA", 3));
            resources.add(new SoftwareResource("SW-302", "Visual Studio Code", 20));
        }

        return resources;
    }
}
