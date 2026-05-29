package ooad.ucer02;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        EquipmentModel model = new EquipmentModel(database);
        EquipmentReservationController controller = new EquipmentReservationController(model);
        EquipmentReservationFormView view = new EquipmentReservationFormView(controller);
        controller.setView(view);

        // [Reservation saved]
        view.enterReservationDetails(new ReservationDetails("U-001", "R-101", "2026-06-01", 1));

        // [Validation error]
        view.enterReservationDetails(new ReservationDetails("", "R-101", "2026-06-01", 1));

        // [Database error]
        view.enterReservationDetails(new ReservationDetails("U-001", "DB_ERROR", "2026-06-01", 1));
    }
}
