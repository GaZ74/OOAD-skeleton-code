package ooad.ucrr05;

public class ManagerApprovalView {
    private ManagerApprovalController controller;

    public ManagerApprovalView(ManagerApprovalController controller) {
        this.controller = controller;
    }

    public void reviewRoomRequest(String reservationId) {
        System.out.println("\nManager reviews room reservation: " + reservationId);
        controller.reviewRoomRequest(reservationId);
    }

    public void submitApprovalDecision(ApprovalDecision decision) {
        controller.submitApprovalDecision(decision);
    }

    public void displayReservationDetails(RoomReservation reservation) {
        System.out.println("Room reservation details: " + reservation);
    }

    public void displayApprovalConfirmation() {
        System.out.println("Room reservation approved successfully.");
    }

    public void displayRejectionConfirmation() {
        System.out.println("Room reservation rejected successfully.");
    }

    public void displayReservationNotFound() {
        System.out.println("Room reservation not found.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while processing room approval: " + message);
    }
}
