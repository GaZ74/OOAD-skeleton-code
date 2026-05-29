package ooad.ucer09;

public class EquipmentModel {
    private final Database database;

    public EquipmentModel(Database database) {
        this.database = database;
    }

    public MaintenanceEvaluation evaluateMaintenanceNeed(MaintenanceReport report) {
        database.storeMaintenanceReport(report);
        return new MaintenanceEvaluation(report.getReportId(), report.isMaintenanceRequired());
    }
}
