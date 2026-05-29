package ooad.ucer03;

import java.util.List;

public class ReservationReviewController {
    private final EquipmentModel model;
    private ReservationReviewView view;

    public ReservationReviewController(EquipmentModel model) {
        this.model = model;
    }

    public void setView(ReservationReviewView view) {
        this.view = view;
    }

    public void loadPendingReservations() {
        List<PendingReservation> reservationList = model.fetchPendingReservations();
        view.displayPendingReservations(reservationList);
    }
}
