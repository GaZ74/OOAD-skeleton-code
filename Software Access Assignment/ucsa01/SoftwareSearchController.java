package ooad.ucsa01;

import java.util.List;

public class SoftwareSearchController {
    private final SoftwareModel model;
    private SoftwareSearchView view;

    public SoftwareSearchController(SoftwareModel model) {
        this.model = model;
    }

    public void setView(SoftwareSearchView view) {
        this.view = view;
    }

    public void submitSearch(SoftwareSearchCriteria criteria) {
        try {
            List<SoftwareResource> resourceList = model.findAvailableResources(criteria);

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
