package ooad.ucex05;

public class ManagerApprovalController {
    private ExtensionModel model;
    private ManagerApprovalView view;

    public ManagerApprovalController(ExtensionModel model) {
        this.model = model;
    }

    public void setView(ManagerApprovalView view) {
        this.view = view;
    }

    public void reviewExtensionRequest(String requestId) {
        try {
            ExtensionRequest request = model.getApprovalRequiredRequest(requestId);

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
