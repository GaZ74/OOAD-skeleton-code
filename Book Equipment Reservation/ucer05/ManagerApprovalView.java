package ooad.ucer05;

public class ManagerApprovalView {
    private final ManagerApprovalController controller;

    public ManagerApprovalView(ManagerApprovalController controller) {
        this.controller = controller;
    }

    public void reviewHighValueReservation(ApprovalDecision decision) {
        controller.submitApprovalDecision(decision);
    }

    public void displayApprovalConfirmation(ApprovalDecision decision) {
        System.out.println("Approval confirmed for reservation: " + decision.getReservationId());
        System.out.println("Status: APPROVED");
    }

    public void displayRejectionConfirmation(ApprovalDecision decision) {
        System.out.println("Rejection confirmed for reservation: " + decision.getReservationId());
        System.out.println("Status: REJECTED");
    }
}
