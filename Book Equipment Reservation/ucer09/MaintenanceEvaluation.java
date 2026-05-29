package ooad.ucer09;

public class MaintenanceEvaluation {
    private final String reportId;
    private final boolean maintenanceRequired;

    public MaintenanceEvaluation(String reportId, boolean maintenanceRequired) {
        this.reportId = reportId;
        this.maintenanceRequired = maintenanceRequired;
    }

    public String getReportId() {
        return reportId;
    }

    public boolean isMaintenanceRequired() {
        return maintenanceRequired;
    }
}
