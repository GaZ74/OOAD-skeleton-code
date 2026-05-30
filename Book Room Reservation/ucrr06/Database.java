package ooad.ucrr06;

public class Database {
    public String getReservationStatus(String reservationId) throws DatabaseException {
        if ("DB_ERROR".equals(reservationId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("RR-001".equals(reservationId)) {
            return "APPROVED";
        }

        return "PENDING";
    }

    public boolean updateRoomStatus(String reservationId, String status) throws DatabaseException {
        if ("DB_ERROR".equals(reservationId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        return true;
    }
}