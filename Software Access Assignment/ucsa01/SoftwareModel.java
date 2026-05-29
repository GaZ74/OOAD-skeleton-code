package ooad.ucsa01;

import java.util.List;

public class SoftwareModel {
    private final Database database;

    public SoftwareModel(Database database) {
        this.database = database;
    }

    public List<SoftwareResource> findAvailableResources(SoftwareSearchCriteria criteria) throws DatabaseException {
        return database.queryAvailableResources(criteria);
    }
}
