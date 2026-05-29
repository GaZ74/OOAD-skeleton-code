package ooad.ucrr01;

import java.util.List;

public class RoomSearchController {
    private final RoomModel model;
    private RoomSearchView view;

    public RoomSearchController(RoomModel model) {
        this.model = model;
    }

    public void setView(RoomSearchView view) {
        this.view = view;
    }

    public void submitSearch(RoomSearchCriteria criteria) {
        try {
            List<Room> resourceList = model.findAvailableResources(criteria);

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
