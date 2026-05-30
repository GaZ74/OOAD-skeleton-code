package ooad.ucsa06;

public class SoftwareModel {
    private Database database;

    public SoftwareModel(Database database) {
        this.database = database;
    }

    public boolean assignLicense(LicenseAssignment assignment) throws DatabaseException {
        if (assignment.getRequestId() == null || assignment.getRequestId().trim().isEmpty()) {
            return false;
        }

        if (assignment.getSoftwareId() == null || assignment.getSoftwareId().trim().isEmpty()) {
            return false;
        }

        if (assignment.getMachineId() == null || assignment.getMachineId().trim().isEmpty()) {
            return false;
        }

        String status = database.getRequestStatus(assignment.getRequestId());

        if (!"APPROVED".equals(status)) {
            return false;
        }

        return database.updateLicenseAssignment(assignment);
    }
}