package ooad.ucer01;

import java.util.List;

public class EquipmentSearchController {
    private final EquipmentModel model;
    private EquipmentSearchView view;

    public EquipmentSearchController(EquipmentModel model) {
        this.model = model;
    }

    public void setView(EquipmentSearchView view) {
        this.view = view;
    }

    public void submitSearch(SearchCriteria criteria) {
        try {
            List<Resource> resourceList = model.findAvailableResources(criteria);

            if (resourceList.isEmpty()) {
                view.displayNoResultsMessage();
            } else {
                view.displaySearchResults(resourceList);
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
