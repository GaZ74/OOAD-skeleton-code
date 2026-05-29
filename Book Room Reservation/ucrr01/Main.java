package ooad.ucrr01;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        RoomModel model = new RoomModel(database);
        RoomSearchController controller = new RoomSearchController(model);
        RoomSearchView view = new RoomSearchView(controller);
        controller.setView(view);

        // [Rooms found]
        view.enterCriteria(new RoomSearchCriteria("Meeting Room", 6));

        // [No rooms found]
        view.enterCriteria(new RoomSearchCriteria("Meeting Room", 12));

        // [Database error]
        view.enterCriteria(new RoomSearchCriteria("DB_ERROR", 1));
    }
}
