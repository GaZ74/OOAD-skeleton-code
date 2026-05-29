package ooad.ucsa02;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        SoftwareModel model = new SoftwareModel(database);
        SoftwareAccessController controller = new SoftwareAccessController(model);
        SoftwareAccessFormView view = new SoftwareAccessFormView(controller);
        controller.setView(view);

        // [Reservation saved]
        view.enterReservationDetails(new SoftwareAccessDetails("SR-002-001", "SW-301", "USR-1001"));

        // [Validation error]
        view.enterReservationDetails(new SoftwareAccessDetails("", "SW-301", "USR-1001"));

        // [Database error]
        view.enterReservationDetails(new SoftwareAccessDetails("SR-002-003", "DB_ERROR", "USR-1001"));
    }
}
