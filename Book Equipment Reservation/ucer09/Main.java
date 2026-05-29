package ooad.ucer09;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        EquipmentModel model = new EquipmentModel(database);
        MaintenanceReportController controller = new MaintenanceReportController(model);
        MaintenanceReportView view = new MaintenanceReportView(controller);
        controller.setView(view);

        view.submitMaintenanceReport(new MaintenanceReport(
                "MR-009-001",
                "EQ-901",
                "Hydraulic pressure drop detected",
                true));

        view.submitMaintenanceReport(new MaintenanceReport(
                "MR-009-002",
                "EQ-902",
                "Routine post-use check",
                false));
    }
}
