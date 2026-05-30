package ooad.ucsa05;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        SoftwareModel model = new SoftwareModel(database);
        ManagerApprovalController controller = new ManagerApprovalController(model);
        ManagerApprovalView view = new ManagerApprovalView(controller);
        controller.setView(view);

        // [Approved]
        view.reviewSoftwareRequest("SA-EXPENSIVE");
        view.submitApprovalDecision(new ApprovalDecision("SA-EXPENSIVE", true));

        // [Rejected]
        view.reviewSoftwareRequest("SA-SENSITIVE");
        view.submitApprovalDecision(new ApprovalDecision("SA-SENSITIVE", false));

        // [Database error]
        view.reviewSoftwareRequest("DB_ERROR");
        view.submitApprovalDecision(new ApprovalDecision("DB_ERROR", true));
    }
}
