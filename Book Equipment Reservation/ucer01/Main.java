package ooad.ucer01;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        EquipmentModel model = new EquipmentModel(database);
        EquipmentSearchController controller = new EquipmentSearchController(model);
        EquipmentSearchView view = new EquipmentSearchView(controller);
        controller.setView(view);

        // [Resources found]
        view.enterCriteria(new SearchCriteria("Projector", 2));

        // [No resources found]
        view.enterCriteria(new SearchCriteria("Projector", 10));

        // [Database error]
        view.enterCriteria(new SearchCriteria("DB_ERROR", 1));
    }
}
