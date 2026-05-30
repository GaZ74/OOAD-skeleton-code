package ooad.ucrr09;

public class MaintenanceEvaluationResult {
    private boolean maintenanceRequired;
    private String message;

    public MaintenanceEvaluationResult(boolean maintenanceRequired, String message) {
        this.maintenanceRequired = maintenanceRequired;
        this.message = message;
    }

    public boolean isMaintenanceRequired() {
        return maintenanceRequired;
    }

    public String getMessage() {
        return message;
    }
}
