package ooad.ucrr01;

import java.util.List;

public class RoomSearchView {
    private final RoomSearchController controller;

    public RoomSearchView(RoomSearchController controller) {
        this.controller = controller;
    }

    public void enterCriteria(RoomSearchCriteria criteria) {
        controller.submitSearch(criteria);
    }

    public void displaySearchResults(List<Room> resourceList) {
        System.out.println("Rooms found:");
        for (Room room : resourceList) {
            System.out.println("- " + room);
        }
    }

    public void displayNoResultsMessage() {
        System.out.println("No rooms found for the provided criteria.");
    }

    public void displaySystemError(String errorMessage) {
        System.out.println("System error while searching rooms: " + errorMessage);
    }
}
