package ooad.ucsa03;

import java.util.List;

public class SoftwareReviewController {
    private SoftwareModel model;
    private SoftwareReviewView view;

    public SoftwareReviewController(SoftwareModel model) {
        this.model = model;
    }

    public void setView(SoftwareReviewView view) {
        this.view = view;
    }

    public void loadPendingRequests(boolean simulateError) {
        try {
            List<SoftwareRequest> requests = model.fetchPendingRequests(simulateError);

            if (requests.isEmpty()) {
                view.displayNoPendingRequests();
            } else {
                view.displayPendingRequests(requests);
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
