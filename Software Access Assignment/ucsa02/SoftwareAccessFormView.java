package ooad.ucsa02;

public class SoftwareAccessFormView {
    private final SoftwareAccessController controller;

    public SoftwareAccessFormView(SoftwareAccessController controller) {
        this.controller = controller;
    }

    public void enterReservationDetails(SoftwareAccessDetails details) {
        controller.submitReservation(details);
    }

    public void displaySubmissionSuccess(SoftwareAccessConfirmation confirmation) {
        System.out.println("Reservation saved: " + confirmation.getRequestId());
        System.out.println("Software: " + confirmation.getSoftwareId());
    }

    public void displayValidationError(String message) {
        System.out.println("Validation error: " + message);
    }

    public void displaySystemError(String message) {
        System.out.println("System error while saving reservation: " + message);
    }
}
