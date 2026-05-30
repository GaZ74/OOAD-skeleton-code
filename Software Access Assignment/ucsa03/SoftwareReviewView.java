package ooad.ucsa03;

import java.util.List;

public class SoftwareReviewView {
    private SoftwareReviewController controller;

    public SoftwareReviewView(SoftwareReviewController controller) {
        this.controller = controller;
    }

    public void requestPendingSoftwareRequests() {
        System.out.println("\nFront-desk staff requests pending software access requests.");
        controller.loadPendingRequests(false);
    }

    public void requestPendingSoftwareRequestsWithError() {
        System.out.println("\nFront-desk staff requests pending software access requests.");
        controller.loadPendingRequests(true);
    }

    public void displayPendingRequests(List<SoftwareRequest> requests) {
        System.out.println("Pending software access requests:");
        for (SoftwareRequest request : requests) {
            System.out.println("- " + request);
        }
    }

    public void displayNoPendingRequests() {
        System.out.println("No pending software access requests.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while loading software requests: " + message);
    }
}
