package ooad.ucrr01;

import java.util.List;

public class RoomModel {
    private final Database database;

    public RoomModel(Database database) {
        this.database = database;
    }

    public List<Room> findAvailableResources(RoomSearchCriteria criteria) throws DatabaseException {
        return database.queryAvailableResources(criteria);
    }
}
