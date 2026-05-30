package ooad.ucex03;

public class ExtensionModel {
    private Database database;

    public ExtensionModel(Database database) {
        this.database = database;
    }

    public boolean checkEligibility(String requestId) throws DatabaseException {
        return database.getEligibilityStatus(requestId);
    }
}
