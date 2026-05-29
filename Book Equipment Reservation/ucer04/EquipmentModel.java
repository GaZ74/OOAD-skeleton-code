package ooad.ucer04;

public class EquipmentModel {
    private final Database database;

    public EquipmentModel(Database database) {
        this.database = database;
    }

    public ResourceValue assessResourceValue(String reservationId) {
        return database.getResourceValue(reservationId);
    }
}
