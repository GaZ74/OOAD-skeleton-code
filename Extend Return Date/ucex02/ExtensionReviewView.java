package ooad.ucex02;

import java.util.List;

public class ExtensionReviewView {
    private final ExtensionReviewController controller;

    public ExtensionReviewView(ExtensionReviewController controller) {
        this.controller = controller;
    }

    public void requestPendingReservations() {
        controller.loadPendingReservations();
    }

    public void displayPendingReservations(List<PendingExtensionRequest> reservationList) {
        System.out.println("Pending extension requests:");
        for (PendingExtensionRequest request : reservationList) {
            System.out.println("- " + request);
        }
    }
}
