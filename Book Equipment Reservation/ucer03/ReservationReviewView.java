package ooad.ucer03;

import java.util.List;

public class ReservationReviewView {
    private final ReservationReviewController controller;

    public ReservationReviewView(ReservationReviewController controller) {
        this.controller = controller;
    }

    public void requestPendingReservations() {
        controller.loadPendingReservations();
    }

    public void displayPendingReservations(List<PendingReservation> reservationList) {
        System.out.println("Pending reservations:");
        for (PendingReservation reservation : reservationList) {
            System.out.println("- " + reservation);
        }
    }
}
