package ooad.ucsa06;

public class LicenseAssignmentController {
    private SoftwareModel model;
    private LicenseAssignmentView view;

    public LicenseAssignmentController(SoftwareModel model) {
        this.model = model;
    }

    public void setView(LicenseAssignmentView view) {
        this.view = view;
    }

    public void assignLicense(LicenseAssignment assignment) {
        try {
            boolean assigned = model.assignLicense(assignment);

            if (assigned) {
                view.displayLicenseAssigned(assignment);
            } else {
                view.displayAssignmentFailed();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
