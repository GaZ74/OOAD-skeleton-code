package ooad.ucer01;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public List<Resource> queryAvailableResources(SearchCriteria criteria) throws DatabaseException {
        // Skeleton behavior for demo/testing.
        if (criteria.getEquipmentType() == null || criteria.getEquipmentType().isBlank()) {
            throw new DatabaseException("Invalid search criteria: equipment type is required.");
        }

        if ("DB_ERROR".equalsIgnoreCase(criteria.getEquipmentType())) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        List<Resource> resources = new ArrayList<>();

        if ("Projector".equalsIgnoreCase(criteria.getEquipmentType()) && criteria.getQuantity() <= 3) {
            resources.add(new Resource("R-101", "Projector - Epson X1", 2));
            resources.add(new Resource("R-102", "Projector - BenQ M5", 1));
        }

        return resources;
    }
}
