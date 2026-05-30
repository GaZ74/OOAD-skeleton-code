package ooad.ucrr06;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        RoomModel model = new RoomModel(database);
        RoomPreparationController controller = new RoomPreparationController(model);
        RoomPreparationView view = new RoomPreparationView(controller);
        controller.setView(view);

        // [Room prepared]
        view.startPreparation("RR-001");

        // [Reservation not approved]
        view.startPreparation("RR-PENDING");

        // [Database error]
        view.startPreparation("DB_ERROR");
    }
}
