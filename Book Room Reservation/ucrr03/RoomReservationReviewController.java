package ooad.ucrr03;

import java.util.List;

public class RoomReservationReviewController {
    private final RoomModel model;
    private RoomReservationReviewView view;

    public RoomReservationReviewController(RoomModel model) {
        this.model = model;
    }

    public void setView(RoomReservationReviewView view) {
        this.view = view;
    }

    public void loadPendingReservations() {
        List<PendingReservation> reservationList = model.fetchPendingReservations();
        view.displayPendingReservations(reservationList);
    }
}
