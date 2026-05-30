package ooad.ucsa05;

public class SoftwareModel {
    private Database database;

    public SoftwareModel(Database database) {
        this.database = database;
    }

    public SoftwareRequest getExpensiveSoftwareRequest(String requestId) throws DatabaseException {
        return database.findExpensiveSoftwareRequest(requestId);
    }

    public boolean recordApprovalDecision(ApprovalDecision decision) throws DatabaseException {
        return database.updateApprovalStatus(decision);
    }
}
