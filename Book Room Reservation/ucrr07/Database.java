package ooad.ucrr07;

public class Database {
    public String getRoomUsageStatus(String reservationId) throws DatabaseException {
        if ("DB_ERROR".equals(reservationId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("RR-001".equals(reservationId)) {
            return "IN_USE";
        }

        return "NOT_IN_USE";
    }

    public boolean updateRoomReturnStatus(String reservationId) throws DatabaseException {
        if ("DB_ERROR".equals(reservationId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        return true;
    }
}
