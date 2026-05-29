package ooad.ucex02;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        ExtensionModel model = new ExtensionModel(database);
        ExtensionReviewController controller = new ExtensionReviewController(model);
        ExtensionReviewView view = new ExtensionReviewView(controller);
        controller.setView(view);

        view.requestPendingReservations();
    }
}
