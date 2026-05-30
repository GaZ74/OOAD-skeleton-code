package ooad.ucex04;

public class FurtherApprovalController {
    private ExtensionModel model;
    private FurtherApprovalView view;

    public FurtherApprovalController(ExtensionModel model) {
        this.model = model;
    }

    public void setView(FurtherApprovalView view) {
        this.view = view;
    }

    public void checkFurtherApproval(String requestId) {
        try {
            boolean needed = model.needFurtherApproval(requestId);

            if (needed) {
                view.displayManagerApprovalRequired();
            } else {
                view.displayAutoApprovalAllowed();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
