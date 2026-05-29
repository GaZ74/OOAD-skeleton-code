package ooad.ucer08;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        EquipmentModel model = new EquipmentModel(database);
        EquipmentInspectionController controller = new EquipmentInspectionController(model);
        EquipmentInspectionView view = new EquipmentInspectionView(controller);
        controller.setView(view);

        view.submitInspectionResult("INS-008-001", "Passed");
    }
}
