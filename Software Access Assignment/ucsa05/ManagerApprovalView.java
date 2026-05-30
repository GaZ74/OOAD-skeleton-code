package ooad.ucsa05;

public class ManagerApprovalView {
    private ManagerApprovalController controller;

    public ManagerApprovalView(ManagerApprovalController controller) {
        this.controller = controller;
    }

    public void reviewSoftwareRequest(String requestId) {
        System.out.println("\nManager reviews software request: " + requestId);
        controller.reviewSoftwareRequest(requestId);
    }

    public void submitApprovalDecision(ApprovalDecision decision) {
        controller.submitApprovalDecision(decision);
    }

    public void displayRequestDetails(SoftwareRequest request) {
        System.out.println("Software request details: " + request);
    }

    public void displayApprovalConfirmation() {
        System.out.println("Software request approved successfully.");
    }

    public void displayRejectionConfirmation() {
        System.out.println("Software request rejected successfully.");
    }

    public void displayRequestNotFound() {
        System.out.println("Software request not found.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while processing software approval: " + message);
    }
}
