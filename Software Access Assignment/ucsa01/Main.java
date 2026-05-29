package ooad.ucsa01;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        SoftwareModel model = new SoftwareModel(database);
        SoftwareSearchController controller = new SoftwareSearchController(model);
        SoftwareSearchView view = new SoftwareSearchView(controller);
        controller.setView(view);

        // [Resources found]
        view.enterSearchCriteria(new SoftwareSearchCriteria("IDE", 3));

        // [No resources found]
        view.enterSearchCriteria(new SoftwareSearchCriteria("IDE", 10));

        // [Database error]
        view.enterSearchCriteria(new SoftwareSearchCriteria("DB_ERROR", 1));
    }
}
