package ooad.ucer02;

public class EquipmentReservationController {
    private final EquipmentModel model;
    private EquipmentReservationFormView view;

    public EquipmentReservationController(EquipmentModel model) {
        this.model = model;
    }

    public void setView(EquipmentReservationFormView view) {
        this.view = view;
    }

    public void submitReservation(ReservationDetails details) {
        String validationError = validate(details);
        if (validationError != null) {
            view.displayValidationError(validationError);
            return;
        }

        try {
            ReservationConfirmation confirmation = model.createReservation(details);
            view.displaySubmissionSuccess(confirmation);
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }

    private String validate(ReservationDetails details) {
        if (details.getUserId() == null || details.getUserId().isBlank()) {
            return "User id is required.";
        }

        if (details.getResourceId() == null || details.getResourceId().isBlank()) {
            return "Resource id is required.";
        }

        if (details.getReservationDate() == null || details.getReservationDate().isBlank()) {
            return "Reservation date is required.";
        }

        if (details.getQuantity() <= 0) {
            return "Quantity must be greater than zero.";
        }

        return null;
    }
}
