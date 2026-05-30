package ooad.ucsa04;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        SoftwareModel model = new SoftwareModel(database);
        SoftwareLicenseCostController controller = new SoftwareLicenseCostController(model);
        SoftwareLicenseCostView view = new SoftwareLicenseCostView(controller);
        controller.setView(view);

        // [Expensive license]
        view.selectRequest("SA-EXPENSIVE");

        // [Normal license]
        view.selectRequest("SA-NORMAL");

        // [Database error]
        view.selectRequest("DB_ERROR");
    }
}
