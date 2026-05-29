package ooad.ucer03;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        EquipmentModel model = new EquipmentModel(database);
        ReservationReviewController controller = new ReservationReviewController(model);
        ReservationReviewView view = new ReservationReviewView(controller);
        controller.setView(view);

        // FrontDeskStaff requests pending reservations.
        view.requestPendingReservations();
    }
}
