package ooad.ucrr03;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        RoomModel model = new RoomModel(database);
        RoomReservationReviewController controller = new RoomReservationReviewController(model);
        RoomReservationReviewView view = new RoomReservationReviewView(controller);
        controller.setView(view);

        view.requestPendingReservations();
    }
}
