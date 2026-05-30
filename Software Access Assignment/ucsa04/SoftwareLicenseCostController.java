package ooad.ucsa04;

public class SoftwareLicenseCostController {
    private SoftwareModel model;
    private SoftwareLicenseCostView view;

    public SoftwareLicenseCostController(SoftwareModel model) {
        this.model = model;
    }

    public void setView(SoftwareLicenseCostView view) {
        this.view = view;
    }

    public void evaluateRequest(String requestId) {
        try {
            String costLevel = model.checkSoftwareLicenseCost(requestId);

            if ("EXPENSIVE".equals(costLevel)) {
                view.displayManagerApprovalRequired();
            } else {
                view.displayITStaffRouting();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}