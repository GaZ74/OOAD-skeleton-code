package ooad.ucer08;

public class EquipmentModel {
    private final Database database;

    public EquipmentModel(Database database) {
        this.database = database;
    }

    public InspectionConfirmation saveInspectionResult(String inspectionId, String result) {
        database.storeInspectionResult(result);
        return new InspectionConfirmation(inspectionId, result);
    }
}
