package ooad.ucer04;

public class EquipmentValueAssessmentView {
    private final EquipmentValueAssessmentController controller;

    public EquipmentValueAssessmentView(EquipmentValueAssessmentController controller) {
        this.controller = controller;
    }

    public void selectReservation(String reservationId) {
        controller.evaluateReservation(reservationId);
    }

    public void displayManagerApprovalRequired(ResourceValue value) {
        System.out.println("High value detected for " + value.getReservationId() + ": " + value.getAmount());
        System.out.println("Manager approval required.");
    }

    public void displayTechnicianRouting(ResourceValue value) {
        System.out.println("Normal value detected for " + value.getReservationId() + ": " + value.getAmount());
        System.out.println("Route to technician.");
    }
}
