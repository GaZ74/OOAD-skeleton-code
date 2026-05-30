package ooad.ucrr09;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        RoomModel model = new RoomModel(database);
        RoomMaintenanceController controller = new RoomMaintenanceController(model);
        RoomMaintenanceView view = new RoomMaintenanceView(controller);
        controller.setView(view);

        // [Maintenance required]
        view.submitMaintenanceReport(new RoomMaintenanceReport("RR-002", "Air conditioner not working", true));

        // [No maintenance required]
        view.submitMaintenanceReport(new RoomMaintenanceReport("RR-001", "Room is ready for next use", false));

        // [Validation error]
        view.submitMaintenanceReport(new RoomMaintenanceReport("RR-003", "", false));

        // [Database error]
        view.submitMaintenanceReport(new RoomMaintenanceReport("DB_ERROR", "Cannot save report", true));
    }
}