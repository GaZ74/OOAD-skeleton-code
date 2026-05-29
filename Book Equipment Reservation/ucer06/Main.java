package ooad.ucer06;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        EquipmentModel model = new EquipmentModel(database);
        EquipmentPreparationController controller = new EquipmentPreparationController(model);
        EquipmentPreparationView view = new EquipmentPreparationView(controller);
        controller.setView(view);

        view.startPreparation("RES-READY-001");
    }
}
