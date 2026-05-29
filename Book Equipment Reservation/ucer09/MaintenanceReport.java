package ooad.ucer09;

public class MaintenanceReport {
    private final String reportId;
    private final String equipmentId;
    private final String issueDescription;
    private final boolean maintenanceRequired;

    public MaintenanceReport(String reportId, String equipmentId, String issueDescription, boolean maintenanceRequired) {
        this.reportId = reportId;
        this.equipmentId = equipmentId;
        this.issueDescription = issueDescription;
        this.maintenanceRequired = maintenanceRequired;
    }

    public String getReportId() {
        return reportId;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public boolean isMaintenanceRequired() {
        return maintenanceRequired;
    }
}
