package ooad.ucex03;

public class Database {
    public boolean getEligibilityStatus(String requestId) throws DatabaseException {
        if ("DB_ERROR".equals(requestId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("EX-ELIGIBLE".equals(requestId)) {
            return true;
        }

        return false;
    }
}
