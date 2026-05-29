package ooad.ucsa02;

public class SoftwareAccessController {
    private final SoftwareModel model;
    private SoftwareAccessFormView view;

    public SoftwareAccessController(SoftwareModel model) {
        this.model = model;
    }

    public void setView(SoftwareAccessFormView view) {
        this.view = view;
    }

    public void submitReservation(SoftwareAccessDetails details) {
        if (details.getRequestId() == null || details.getRequestId().isBlank()
                || details.getSoftwareId() == null || details.getSoftwareId().isBlank()
                || details.getUserId() == null || details.getUserId().isBlank()) {
            view.displayValidationError("Request id, software id, and user id are required.");
            return;
        }

        try {
            SoftwareAccessConfirmation confirmation = model.createReservation(details);
            view.displaySubmissionSuccess(confirmation);
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
