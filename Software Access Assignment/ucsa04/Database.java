package ooad.ucsa04;

public class Database {
    public String getSoftwareLicenseCostLevel(String requestId) throws DatabaseException {
        if ("DB_ERROR".equals(requestId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("SA-EXPENSIVE".equals(requestId)) {
            return "EXPENSIVE";
        }

        return "NORMAL";
    }
}
