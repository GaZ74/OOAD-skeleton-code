package ooad.ucrr03;

import java.util.List;

public class RoomReservationReviewView {
    private final RoomReservationReviewController controller;

    public RoomReservationReviewView(RoomReservationReviewController controller) {
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
