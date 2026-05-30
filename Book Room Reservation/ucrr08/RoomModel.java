package ooad.ucrr08;

public class RoomModel {
    private Database database;

    public RoomModel(Database database) {
        this.database = database;
    }

    public boolean saveInspectionResult(RoomInspectionResult result) throws DatabaseException {
        if (result.getNotes() == null || result.getNotes().trim().isEmpty()) {
            return false;
        }

        return database.storeInspectionResult(result);
    }
}
