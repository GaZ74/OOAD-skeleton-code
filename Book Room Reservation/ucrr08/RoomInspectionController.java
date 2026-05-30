package ooad.ucrr08;

public class RoomInspectionController {
    private RoomModel model;
    private RoomInspectionView view;

    public RoomInspectionController(RoomModel model) {
        this.model = model;
    }

    public void setView(RoomInspectionView view) {
        this.view = view;
    }

    public void recordInspection(RoomInspectionResult result) {
        try {
            boolean saved = model.saveInspectionResult(result);

            if (saved) {
                view.displayInspectionRecorded(result);
            } else {
                view.displayValidationError();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
