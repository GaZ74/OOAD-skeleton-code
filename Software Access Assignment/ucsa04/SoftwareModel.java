package ooad.ucsa04;

public class SoftwareModel {
    private Database database;

    public SoftwareModel(Database database) {
        this.database = database;
    }

    public String checkSoftwareLicenseCost(String requestId) throws DatabaseException {
        return database.getSoftwareLicenseCostLevel(requestId);
    }
}
