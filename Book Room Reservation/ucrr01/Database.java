package ooad.ucrr01;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public List<Room> queryAvailableResources(RoomSearchCriteria criteria) throws DatabaseException {
        if (criteria.getRoomType() == null || criteria.getRoomType().isBlank()) {
            throw new DatabaseException("Invalid search criteria: room type is required.");
        }

        if ("DB_ERROR".equalsIgnoreCase(criteria.getRoomType())) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        List<Room> rooms = new ArrayList<>();

        if ("Meeting Room".equalsIgnoreCase(criteria.getRoomType()) && criteria.getCapacity() <= 8) {
            rooms.add(new Room("RM-201", "Meeting Room - North Wing", 6));
            rooms.add(new Room("RM-202", "Meeting Room - South Wing", 8));
        }

        return rooms;
    }
}
