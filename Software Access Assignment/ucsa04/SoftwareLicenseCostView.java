package ooad.ucsa04;

public class SoftwareLicenseCostView {
    private SoftwareLicenseCostController controller;

    public SoftwareLicenseCostView(SoftwareLicenseCostController controller) {
        this.controller = controller;
    }

    public void selectRequest(String requestId) {
        System.out.println("\nFront-desk staff checks software license cost for: " + requestId);
        controller.evaluateRequest(requestId);
    }

    public void displayManagerApprovalRequired() {
        System.out.println("This software request requires manager approval.");
    }

    public void displayITStaffRouting() {
        System.out.println("This software request can be routed to IT staff.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while checking software license cost: " + message);
    }
}