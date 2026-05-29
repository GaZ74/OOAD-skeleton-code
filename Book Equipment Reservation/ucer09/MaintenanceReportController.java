package ooad.ucer09;

public class MaintenanceReportController {
    private final EquipmentModel model;
    private MaintenanceReportView view;

    public MaintenanceReportController(EquipmentModel model) {
        this.model = model;
    }

    public void setView(MaintenanceReportView view) {
        this.view = view;
    }

    public void processMaintenanceReport(MaintenanceReport report) {
        MaintenanceEvaluation evaluation = model.evaluateMaintenanceNeed(report);
        if (evaluation.isMaintenanceRequired()) {
            view.displayMaintenanceScheduled(evaluation);
        } else {
            view.displayProcessCompleted(evaluation);
        }
    }
}
