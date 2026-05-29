package ooad.ucer08;

public class EquipmentInspectionController {
    private final EquipmentModel model;
    private EquipmentInspectionView view;

    public EquipmentInspectionController(EquipmentModel model) {
        this.model = model;
    }

    public void setView(EquipmentInspectionView view) {
        this.view = view;
    }

    public void recordInspection(String inspectionId, String result) {
        InspectionConfirmation confirmation = model.saveInspectionResult(inspectionId, result);
        view.displayInspectionRecorded(confirmation);
    }
}
