package ooad.ucrr09;

public class RoomMaintenanceController {
    private RoomModel model;
    private RoomMaintenanceView view;

    public RoomMaintenanceController(RoomModel model) {
        this.model = model;
    }

    public void setView(RoomMaintenanceView view) {
        this.view = view;
    }

    public void processMaintenanceReport(RoomMaintenanceReport report) {
        try {
            MaintenanceEvaluationResult result = model.evaluateMaintenanceNeed(report);

            if (result == null) {
                view.displayValidationError();
            } else if (result.isMaintenanceRequired()) {
                view.displayMaintenanceScheduled(result.getMessage());
            } else {
                view.displayProcessCompleted(result.getMessage());
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
