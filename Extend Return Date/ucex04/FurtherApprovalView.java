package ooad.ucex04;

public class FurtherApprovalView {
    private FurtherApprovalController controller;

    public FurtherApprovalView(FurtherApprovalController controller) {
        this.controller = controller;
    }

    public void checkFurtherApproval(String requestId) {
        System.out.println("\nFront-desk staff checks whether further approval is needed for: " + requestId);
        controller.checkFurtherApproval(requestId);
    }

    public void displayManagerApprovalRequired() {
        System.out.println("This extension request needs manager approval.");
    }

    public void displayAutoApprovalAllowed() {
        System.out.println("No further approval needed. Extension can be processed by front-desk staff.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while checking further approval: " + message);
    }
}
