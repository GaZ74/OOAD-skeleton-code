package ooad.ucex05;

public class ManagerApprovalView {
    private ManagerApprovalController controller;

    public ManagerApprovalView(ManagerApprovalController controller) {
        this.controller = controller;
    }

    public void reviewExtensionRequest(String requestId) {
        System.out.println("\nManager reviews extension request: " + requestId);
        controller.reviewExtensionRequest(requestId);
    }

    public void submitApprovalDecision(ApprovalDecision decision) {
        controller.submitApprovalDecision(decision);
    }

    public void displayRequestDetails(ExtensionRequest request) {
        System.out.println("Extension request details: " + request);
    }

    public void displayApprovalConfirmation() {
        System.out.println("Extension request approved successfully.");
    }

    public void displayRejectionConfirmation() {
        System.out.println("Extension request rejected successfully.");
    }

    public void displayRequestNotFound() {
        System.out.println("Extension request not found.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while processing extension approval: " + message);
    }
}
