package ooad.ucex02;

import java.util.List;

public class ExtensionReviewController {
    private final ExtensionModel model;
    private ExtensionReviewView view;

    public ExtensionReviewController(ExtensionModel model) {
        this.model = model;
    }

    public void setView(ExtensionReviewView view) {
        this.view = view;
    }

    public void loadPendingReservations() {
        List<PendingExtensionRequest> reservationList = model.fetchPendingReservations();
        view.displayPendingReservations(reservationList);
    }
}
