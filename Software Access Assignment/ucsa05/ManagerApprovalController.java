package ooad.ucsa05;

public class ManagerApprovalController {
    private SoftwareModel model;
    private ManagerApprovalView view;

    public ManagerApprovalController(SoftwareModel model) {
        this.model = model;
    }

    public void setView(ManagerApprovalView view) {
        this.view = view;
    }

    public void reviewSoftwareRequest(String requestId) {
        try {
            SoftwareRequest request = model.getExpensiveSoftwareRequest(requestId);

            if (request == null) {
                view.displayRequestNotFound();
            } else {
                view.displayRequestDetails(request);
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }

    public void submitApprovalDecision(ApprovalDecision decision) {
        try {
            boolean success = model.recordApprovalDecision(decision);

            if (success && decision.isApproved()) {
                view.displayApprovalConfirmation();
            } else if (success) {
                view.displayRejectionConfirmation();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
