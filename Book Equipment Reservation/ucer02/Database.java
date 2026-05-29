package ooad.ucer02;

public class Database {

    public boolean saveReservation(ReservationDetails details) throws DatabaseException {
        // Skeleton behavior for demo/testing.
        if ("DB_ERROR".equalsIgnoreCase(details.getResourceId())) {
            throw new DatabaseException("Simulated database write failure.");
        }

        return true;
    }
}
