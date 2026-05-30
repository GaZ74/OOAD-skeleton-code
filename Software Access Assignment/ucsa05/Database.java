package ooad.ucsa05;

public class Database {
    public SoftwareRequest findExpensiveSoftwareRequest(String requestId) throws DatabaseException {
        if ("DB_ERROR".equals(requestId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("SA-EXPENSIVE".equals(requestId)) {
            return new SoftwareRequest("SA-EXPENSIVE", "Adobe Creative Cloud", "WAITING_MANAGER_APPROVAL");
        }

        if ("SA-SENSITIVE".equals(requestId)) {
            return new SoftwareRequest("SA-SENSITIVE", "Enterprise Security Tool", "WAITING_MANAGER_APPROVAL");
        }

        return null;
    }

    public boolean updateApprovalStatus(ApprovalDecision decision) throws DatabaseException {
        if ("DB_ERROR".equals(decision.getRequestId())) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        return true;
    }
}
