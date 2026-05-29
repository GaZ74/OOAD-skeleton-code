package ooad.ucer07;

public class EquipmentModel {
    private final Database database;

    public EquipmentModel(Database database) {
        this.database = database;
    }

    public ReturnConfirmation updateResourceStatus(String reservationId, String status) {
        database.updateResourceStatus(status);
        return new ReturnConfirmation(reservationId, status);
    }
}
