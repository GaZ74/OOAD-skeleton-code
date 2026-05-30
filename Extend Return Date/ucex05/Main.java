package ooad.ucex05;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        ExtensionModel model = new ExtensionModel(database);
        ManagerApprovalController controller = new ManagerApprovalController(model);
        ManagerApprovalView view = new ManagerApprovalView(controller);
        controller.setView(view);

        // [Approved]
        view.reviewExtensionRequest("EX-LONG");
        view.submitApprovalDecision(new ApprovalDecision("EX-LONG", true));

        // [Rejected]
        view.reviewExtensionRequest("EX-RISKY");
        view.submitApprovalDecision(new ApprovalDecision("EX-RISKY", false));

        // [Database error]
        view.reviewExtensionRequest("DB_ERROR");
        view.submitApprovalDecision(new ApprovalDecision("DB_ERROR", true));
    }
}
