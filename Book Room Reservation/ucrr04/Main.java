package ooad.ucrr04;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        RoomModel model = new RoomModel(database);
        RoomValueAssessmentController controller = new RoomValueAssessmentController(model);
        RoomValueAssessmentView view = new RoomValueAssessmentView(controller);
        controller.setView(view);

        // [High-value or sensitive room]
        view.selectReservation("RR-HIGH");

        // [Normal room]
        view.selectReservation("RR-NORMAL");

        // [Database error]
        view.selectReservation("DB_ERROR");
    }
}