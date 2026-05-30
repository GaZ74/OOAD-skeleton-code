package ooad.ucrr09;

public class RoomModel {
    private Database database;

    public RoomModel(Database database) {
        this.database = database;
    }

    public MaintenanceEvaluationResult evaluateMaintenanceNeed(RoomMaintenanceReport report) throws DatabaseException {
        if (report.getDescription() == null || report.getDescription().trim().isEmpty()) {
            return null;
        }

        database.storeMaintenanceReport(report);

        if (report.isFaultFound()) {
            return new MaintenanceEvaluationResult(true, "Fault found. Room maintenance has been scheduled.");
        }

        return new MaintenanceEvaluationResult(false, "No fault found. Room can be used again.");
    }
}
