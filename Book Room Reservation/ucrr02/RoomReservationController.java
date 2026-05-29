package ooad.ucrr02;

public class RoomReservationController {
    private final RoomModel model;
    private RoomReservationFormView view;

    public RoomReservationController(RoomModel model) {
        this.model = model;
    }

    public void setView(RoomReservationFormView view) {
        this.view = view;
    }

    public void submitReservation(RoomReservationDetails details) {
        if (details.getReservationId() == null || details.getReservationId().isBlank()
                || details.getRoomId() == null || details.getRoomId().isBlank()
                || details.getUserId() == null || details.getUserId().isBlank()) {
            view.displayValidationError("Reservation id, room id, and user id are required.");
            return;
        }

        try {
            ReservationConfirmation confirmation = model.createReservation(details);
            view.displaySubmissionSuccess(confirmation);
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
