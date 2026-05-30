package ooad.ucex05;

public class ExtensionModel {
    private Database database;

    public ExtensionModel(Database database) {
        this.database = database;
    }

    public ExtensionRequest getApprovalRequiredRequest(String requestId) throws DatabaseException {
        return database.findApprovalRequiredRequest(requestId);
    }

    public boolean recordApprovalDecision(ApprovalDecision decision) throws DatabaseException {
        return database.updateApprovalStatus(decision);
    }
}
