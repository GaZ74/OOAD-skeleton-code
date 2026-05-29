package ooad.ucer08;

public class EquipmentInspectionView {
    private final EquipmentInspectionController controller;

    public EquipmentInspectionView(EquipmentInspectionController controller) {
        this.controller = controller;
    }

    public void submitInspectionResult(String inspectionId, String result) {
        controller.recordInspection(inspectionId, result);
    }

    public void displayInspectionRecorded(InspectionConfirmation confirmation) {
        System.out.println("Inspection recorded for inspection: " + confirmation.getInspectionId());
        System.out.println("Result: " + confirmation.getResult());
    }
}
