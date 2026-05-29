package ooad.ucrr02;

public class RoomReservationFormView {
    private final RoomReservationController controller;

    public RoomReservationFormView(RoomReservationController controller) {
        this.controller = controller;
    }

    public void enterReservationDetails(RoomReservationDetails details) {
        controller.submitReservation(details);
    }

    public void displaySubmissionSuccess(ReservationConfirmation confirmation) {
        System.out.println("Reservation saved: " + confirmation.getReservationId());
        System.out.println("Room: " + confirmation.getRoomId());
    }

    public void displayValidationError(String message) {
        System.out.println("Validation error: " + message);
    }

    public void displaySystemError(String message) {
        System.out.println("System error while saving reservation: " + message);
    }
}
