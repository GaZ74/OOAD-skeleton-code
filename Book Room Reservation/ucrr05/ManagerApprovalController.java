package ooad.ucrr05;

public class ManagerApprovalController {
    private RoomModel model;
    private ManagerApprovalView view;

    public ManagerApprovalController(RoomModel model) {
        this.model = model;
    }

    public void setView(ManagerApprovalView view) {
        this.view = view;
    }

    public void reviewRoomRequest(String reservationId) {
        try {
            RoomReservation reservation = model.getHighValueRoomReservation(reservationId);

            if (reservation == null) {
                view.displayReservationNotFound();
            } else {
                view.displayReservationDetails(reservation);
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }

    public void submitApprovalDecision(ApprovalDecision decision) {
        try {
            boolean success = model.recordApprovalDecision(decision);

            if (success && decision.isApproved()) {
                view.displayApprovalConfirmation();
            } else if (success) {
                view.displayRejectionConfirmation();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}