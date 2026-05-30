package ooad.ucrr08;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        RoomModel model = new RoomModel(database);
        RoomInspectionController controller = new RoomInspectionController(model);
        RoomInspectionView view = new RoomInspectionView(controller);
        controller.setView(view);

        // [Inspection recorded - no issue]
        view.submitInspectionResult(new RoomInspectionResult("RR-001", "Room is clean and equipment is normal", false));

        // [Inspection recorded - issue found]
        view.submitInspectionResult(new RoomInspectionResult("RR-002", "Projector cable missing", true));

        // [Validation error]
        view.submitInspectionResult(new RoomInspectionResult("RR-003", "", false));

        // [Database error]
        view.submitInspectionResult(new RoomInspectionResult("DB_ERROR", "Cannot inspect", false));
    }
}