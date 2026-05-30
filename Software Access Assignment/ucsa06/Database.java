package ooad.ucsa06;

public class Database {
    public String getRequestStatus(String requestId) throws DatabaseException {
        if ("DB_ERROR".equals(requestId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("SA-001".equals(requestId) || "SA-002".equals(requestId)) {
            return "APPROVED";
        }

        return "PENDING";
    }

    public boolean updateLicenseAssignment(LicenseAssignment assignment) throws DatabaseException {
        if ("DB_ERROR".equals(assignment.getRequestId())) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        return true;
    }
}
