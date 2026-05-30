package ooad.ucrr07;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        RoomModel model = new RoomModel(database);
        RoomReturnController controller = new RoomReturnController(model);
        RoomReturnView view = new RoomReturnView(controller);
        controller.setView(view);

        // [Return acknowledged]
        view.acknowledgeReturn("RR-001");

        // [Invalid return]
        view.acknowledgeReturn("RR-NOT-USING");

        // [Database error]
        view.acknowledgeReturn("DB_ERROR");
    }
}