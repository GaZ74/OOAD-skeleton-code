package ooad.ucrr04;

public class Database {
    public String getRoomValue(String reservationId) throws DatabaseException {
        if ("DB_ERROR".equals(reservationId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("RR-HIGH".equals(reservationId)) {
            return "HIGH";
        }

        return "NORMAL";
    }
}