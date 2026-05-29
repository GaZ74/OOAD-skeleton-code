package ooad.ucer04;

public class EquipmentValueAssessmentController {
    private static final double HIGH_VALUE_THRESHOLD = 10000.00;

    private final EquipmentModel model;
    private EquipmentValueAssessmentView view;

    public EquipmentValueAssessmentController(EquipmentModel model) {
        this.model = model;
    }

    public void setView(EquipmentValueAssessmentView view) {
        this.view = view;
    }

    public void evaluateReservation(String reservationId) {
        ResourceValue value = model.assessResourceValue(reservationId);

        if (value.getAmount() >= HIGH_VALUE_THRESHOLD) {
            view.displayManagerApprovalRequired(value);
        } else {
            view.displayTechnicianRouting(value);
        }
    }
}
