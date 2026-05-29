package ooad.ucer05;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        EquipmentModel model = new EquipmentModel(database);
        ManagerApprovalController controller = new ManagerApprovalController(model);
        ManagerApprovalView view = new ManagerApprovalView(controller);
        controller.setView(view);

        // [Approved]
        view.reviewHighValueReservation(new ApprovalDecision("RES-HIGH", true, "Manager approved high value reservation."));

        // [Rejected]
        view.reviewHighValueReservation(new ApprovalDecision("RES-HIGH", false, "Manager rejected high value reservation."));
    }
}
