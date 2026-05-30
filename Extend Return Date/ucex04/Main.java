package ooad.ucex04;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        ExtensionModel model = new ExtensionModel(database);
        FurtherApprovalController controller = new FurtherApprovalController(model);
        FurtherApprovalView view = new FurtherApprovalView(controller);
        controller.setView(view);

        // [Needs manager approval]
        view.checkFurtherApproval("EX-LONG");

        // [No further approval needed]
        view.checkFurtherApproval("EX-SHORT");

        // [Database error]
        view.checkFurtherApproval("DB_ERROR");
    }
}
