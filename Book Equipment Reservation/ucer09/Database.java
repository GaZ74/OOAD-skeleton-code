package ooad.ucer09;

public class Database {

    public boolean storeMaintenanceReport(MaintenanceReport report) {
        return report != null && report.getReportId() != null && !report.getReportId().trim().isEmpty();
    }
}
