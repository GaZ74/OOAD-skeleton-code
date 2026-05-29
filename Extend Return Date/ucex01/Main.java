package ooad.ucex01;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        ExtensionModel model = new ExtensionModel(database);
        ExtensionRequestController controller = new ExtensionRequestController(model);
        ExtensionRequestFormView view = new ExtensionRequestFormView(controller);
        controller.setView(view);

        // [Reservation saved]
        view.enterReservationDetails(new ExtensionRequestDetails("ER-001-001", "RS-700", "USR-1001", 2));

        // [Validation error]
        view.enterReservationDetails(new ExtensionRequestDetails("", "RS-700", "USR-1001", 2));

        // [Database error]
        view.enterReservationDetails(new ExtensionRequestDetails("ER-001-003", "DB_ERROR", "USR-1001", 2));
    }
}
