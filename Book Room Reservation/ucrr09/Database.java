package ooad.ucrr09;

public class Database {
    public boolean storeMaintenanceReport(RoomMaintenanceReport report) throws DatabaseException {
        if ("DB_ERROR".equals(report.getReservationId())) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        return true;
    }
}
