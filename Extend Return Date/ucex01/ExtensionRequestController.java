package ooad.ucex01;

public class ExtensionRequestController {
    private final ExtensionModel model;
    private ExtensionRequestFormView view;

    public ExtensionRequestController(ExtensionModel model) {
        this.model = model;
    }

    public void setView(ExtensionRequestFormView view) {
        this.view = view;
    }

    public void submitReservation(ExtensionRequestDetails details) {
        if (details.getRequestId() == null || details.getRequestId().isBlank()
                || details.getReservationId() == null || details.getReservationId().isBlank()
                || details.getUserId() == null || details.getUserId().isBlank()
                || details.getExtensionDays() <= 0) {
            view.displayValidationError("Request id, reservation id, user id, and extension days are required.");
            return;
        }

        try {
            ExtensionRequestConfirmation confirmation = model.createReservation(details);
            view.displaySubmissionSuccess(confirmation);
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
