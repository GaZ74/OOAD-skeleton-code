package ooad.ucex04;

public class Database {
    public boolean checkFurtherApprovalRequired(String requestId) throws DatabaseException {
        if ("DB_ERROR".equals(requestId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("EX-LONG".equals(requestId)) {
            return true;
        }

        return false;
    }
}
