package ooad.ucsa03;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        SoftwareModel model = new SoftwareModel(database);
        SoftwareReviewController controller = new SoftwareReviewController(model);
        SoftwareReviewView view = new SoftwareReviewView(controller);
        controller.setView(view);

        // [Pending requests found]
        view.requestPendingSoftwareRequests();

        // [Database error]
        view.requestPendingSoftwareRequestsWithError();
    }
}
