package ooad.ucrr02;

public class Database {

    public boolean saveReservation(RoomReservationDetails details) throws DatabaseException {
        if (details.getRoomId() == null || details.getRoomId().isBlank()) {
            throw new DatabaseException("Room id is required.");
        }

        if ("DB_ERROR".equalsIgnoreCase(details.getRoomId())) {
            throw new DatabaseException("Simulated database failure while saving reservation.");
        }

        return true;
    }
}
