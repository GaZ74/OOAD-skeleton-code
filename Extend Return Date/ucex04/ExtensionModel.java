package ooad.ucex04;

public class ExtensionModel {
    private Database database;

    public ExtensionModel(Database database) {
        this.database = database;
    }

    public boolean needFurtherApproval(String requestId) throws DatabaseException {
        return database.checkFurtherApprovalRequired(requestId);
    }
}
