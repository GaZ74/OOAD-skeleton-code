package ooad.ucex03;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        ExtensionModel model = new ExtensionModel(database);
        EligibilityCheckController controller = new EligibilityCheckController(model);
        EligibilityCheckView view = new EligibilityCheckView(controller);
        controller.setView(view);

        // [Eligible]
        view.checkEligibility("EX-ELIGIBLE");

        // [Not eligible]
        view.checkEligibility("EX-NOT-ELIGIBLE");

        // [Database error]
        view.checkEligibility("DB_ERROR");
    }
}
