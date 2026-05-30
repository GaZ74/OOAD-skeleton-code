package ooad.ucsa06;

public class LicenseAssignmentView {
    private LicenseAssignmentController controller;

    public LicenseAssignmentView(LicenseAssignmentController controller) {
        this.controller = controller;
    }

    public void assignLicense(LicenseAssignment assignment) {
        System.out.println("\nIT staff assigns software license for request: " + assignment.getRequestId());
        controller.assignLicense(assignment);
    }

    public void displayLicenseAssigned(LicenseAssignment assignment) {
        System.out.println("Software license assigned successfully.");
        System.out.println(assignment);
    }

    public void displayAssignmentFailed() {
        System.out.println("Cannot assign license. Request may be invalid, incomplete, or not approved.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while assigning software license: " + message);
    }
}
