package ooad.ucex01;

public class Database {

    public boolean saveReservation(ExtensionRequestDetails details) throws DatabaseException {
        if (details.getReservationId() == null || details.getReservationId().isBlank()) {
            throw new DatabaseException("Reservation id is required.");
        }

        if ("DB_ERROR".equalsIgnoreCase(details.getReservationId())) {
            throw new DatabaseException("Simulated database failure while saving extension request.");
        }

        return true;
    }
}
