package ooad.ucer05;

public class ManagerApprovalController {
    private final EquipmentModel model;
    private ManagerApprovalView view;

    public ManagerApprovalController(EquipmentModel model) {
        this.model = model;
    }

    public void setView(ManagerApprovalView view) {
        this.view = view;
    }

    public void submitApprovalDecision(ApprovalDecision decision) {
        ApprovalDecision recordedDecision = model.recordApprovalDecision(decision);

        if (recordedDecision.isApproved()) {
            view.displayApprovalConfirmation(recordedDecision);
        } else {
            view.displayRejectionConfirmation(recordedDecision);
        }
    }
}
