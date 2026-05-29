package ooad.ucer09;

public class MaintenanceReportView {
    private final MaintenanceReportController controller;

    public MaintenanceReportView(MaintenanceReportController controller) {
        this.controller = controller;
    }

    public void submitMaintenanceReport(MaintenanceReport report) {
        controller.processMaintenanceReport(report);
    }

    public void displayMaintenanceScheduled(MaintenanceEvaluation evaluation) {
        System.out.println("Maintenance scheduled for report: " + evaluation.getReportId());
        System.out.println("Status: MAINTENANCE_REQUIRED");
    }

    public void displayProcessCompleted(MaintenanceEvaluation evaluation) {
        System.out.println("Maintenance report completed for report: " + evaluation.getReportId());
        System.out.println("Status: NO_MAINTENANCE_REQUIRED");
    }
}
