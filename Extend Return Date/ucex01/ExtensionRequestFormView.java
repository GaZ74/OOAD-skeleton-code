package ooad.ucex01;

public class ExtensionRequestFormView {
    private final ExtensionRequestController controller;

    public ExtensionRequestFormView(ExtensionRequestController controller) {
        this.controller = controller;
    }

    public void enterReservationDetails(ExtensionRequestDetails details) {
        controller.submitReservation(details);
    }

    public void displaySubmissionSuccess(ExtensionRequestConfirmation confirmation) {
        System.out.println("Reservation saved: " + confirmation.getRequestId());
        System.out.println("Reservation: " + confirmation.getReservationId());
    }

    public void displayValidationError(String message) {
        System.out.println("Validation error: " + message);
    }

    public void displaySystemError(String message) {
        System.out.println("System error while saving reservation: " + message);
    }
}
