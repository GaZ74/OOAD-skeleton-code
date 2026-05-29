package ooad.ucer01;

import java.util.List;

public class EquipmentModel {
    private final Database database;

    public EquipmentModel(Database database) {
        this.database = database;
    }

    public List<Resource> findAvailableResources(SearchCriteria criteria) throws DatabaseException {
        return database.queryAvailableResources(criteria);
    }
}
