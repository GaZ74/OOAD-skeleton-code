package ooad.ucrr05;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        RoomModel model = new RoomModel(database);
        ManagerApprovalController controller = new ManagerApprovalController(model);
        ManagerApprovalView view = new ManagerApprovalView(controller);
        controller.setView(view);

        // [Approved]
        view.reviewRoomRequest("RR-HIGH");
        view.submitApprovalDecision(new ApprovalDecision("RR-HIGH", true));

        // [Rejected]
        view.reviewRoomRequest("RR-SENSITIVE");
        view.submitApprovalDecision(new ApprovalDecision("RR-SENSITIVE", false));

        // [Database error]
        view.reviewRoomRequest("DB_ERROR");
        view.submitApprovalDecision(new ApprovalDecision("DB_ERROR", true));
    }
}