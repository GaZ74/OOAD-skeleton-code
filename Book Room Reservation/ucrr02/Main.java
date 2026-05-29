package ooad.ucrr02;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        RoomModel model = new RoomModel(database);
        RoomReservationController controller = new RoomReservationController(model);
        RoomReservationFormView view = new RoomReservationFormView(controller);
        controller.setView(view);

        // [Reservation saved]
        view.enterReservationDetails(new RoomReservationDetails("RR-002-001", "RM-201", "USR-1001"));

        // [Validation error]
        view.enterReservationDetails(new RoomReservationDetails("", "RM-201", "USR-1001"));

        // [Database error]
        view.enterReservationDetails(new RoomReservationDetails("RR-002-003", "DB_ERROR", "USR-1001"));
    }
}
