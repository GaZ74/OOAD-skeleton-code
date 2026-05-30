package ooad.ucrr08;

public class Database {
    public boolean storeInspectionResult(RoomInspectionResult result) throws DatabaseException {
        if ("DB_ERROR".equals(result.getReservationId())) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        return true;
    }
}
