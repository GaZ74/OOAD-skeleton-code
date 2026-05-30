package ooad.ucrr08;

public class RoomInspectionView {
    private RoomInspectionController controller;

    public RoomInspectionView(RoomInspectionController controller) {
        this.controller = controller;
    }

    public void submitInspectionResult(RoomInspectionResult result) {
        System.out.println("\nTechnician submits room inspection result for: " + result.getReservationId());
        controller.recordInspection(result);
    }

    public void displayInspectionRecorded(RoomInspectionResult result) {
        System.out.println("Room inspection recorded successfully.");
        System.out.println(result);
    }

    public void displayValidationError() {
        System.out.println("Room inspection result is invalid. Please enter inspection notes.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while recording room inspection: " + message);
    }
}
