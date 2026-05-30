package ooad.ucsa06;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        SoftwareModel model = new SoftwareModel(database);
        LicenseAssignmentController controller = new LicenseAssignmentController(model);
        LicenseAssignmentView view = new LicenseAssignmentView(controller);
        controller.setView(view);

        // [License assigned]
        view.assignLicense(new LicenseAssignment("SA-001", "SW-001", "LAB-PC-01"));

        // [Request not approved]
        view.assignLicense(new LicenseAssignment("SA-PENDING", "SW-001", "LAB-PC-02"));

        // [Validation error]
        view.assignLicense(new LicenseAssignment("SA-002", "", "LAB-PC-03"));

        // [Database error]
        view.assignLicense(new LicenseAssignment("DB_ERROR", "SW-001", "LAB-PC-04"));
    }
}