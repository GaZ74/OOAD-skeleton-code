package ooad.ucer06;

public class EquipmentModel {
    private final Database database;

    public EquipmentModel(Database database) {
        this.database = database;
    }

    public PreparationConfirmation updateResourceStatus(String reservationId, String status) {
        database.updateResourceStatus(status);
        return new PreparationConfirmation(reservationId, status);
    }
}
