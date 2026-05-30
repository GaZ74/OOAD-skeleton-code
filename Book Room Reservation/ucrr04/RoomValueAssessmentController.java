package ooad.ucrr04;

public class RoomValueAssessmentController {
    private RoomModel model;
    private RoomValueAssessmentView view;

    public RoomValueAssessmentController(RoomModel model) {
        this.model = model;
    }

    public void setView(RoomValueAssessmentView view) {
        this.view = view;
    }

    public void evaluateReservation(String reservationId) {
        try {
            String value = model.assessRoomValue(reservationId);

            if ("HIGH".equals(value)) {
                view.displayManagerApprovalRequired();
            } else {
                view.displayTechnicianRouting();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}