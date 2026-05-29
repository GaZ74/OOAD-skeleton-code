package ooad.ucer02;

public class EquipmentReservationFormView {
    private final EquipmentReservationController controller;

    public EquipmentReservationFormView(EquipmentReservationController controller) {
        this.controller = controller;
    }

    public void enterReservationDetails(ReservationDetails details) {
        controller.submitReservation(details);
    }

    public void displaySubmissionSuccess(ReservationConfirmation confirmation) {
        System.out.println("Reservation saved: " + confirmation);
    }

    public void displayValidationError(String errorMessage) {
        System.out.println("Validation error: " + errorMessage);
    }

    public void displaySystemError(String errorMessage) {
        System.out.println("System error while submitting reservation: " + errorMessage);
    }
}
