package ooad.ucex05;

public class Database {
    public ExtensionRequest findApprovalRequiredRequest(String requestId) throws DatabaseException {
        if ("DB_ERROR".equals(requestId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("EX-LONG".equals(requestId)) {
            return new ExtensionRequest("EX-LONG", "U-001", "RES-001", "WAITING_MANAGER_APPROVAL");
        }

        if ("EX-RISKY".equals(requestId)) {
            return new ExtensionRequest("EX-RISKY", "U-002", "RES-002", "WAITING_MANAGER_APPROVAL");
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
