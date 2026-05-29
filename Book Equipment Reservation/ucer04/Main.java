package ooad.ucer04;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        EquipmentModel model = new EquipmentModel(database);
        EquipmentValueAssessmentController controller = new EquipmentValueAssessmentController(model);
        EquipmentValueAssessmentView view = new EquipmentValueAssessmentView(controller);
        controller.setView(view);

        // [High value]
        view.selectReservation("RES-HIGH");

        // [Normal value]
        view.selectReservation("RES-NORMAL");
    }
}
