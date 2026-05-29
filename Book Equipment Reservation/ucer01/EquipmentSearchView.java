package ooad.ucer01;

import java.util.List;

public class EquipmentSearchView {
    private final EquipmentSearchController controller;

    public EquipmentSearchView(EquipmentSearchController controller) {
        this.controller = controller;
    }

    public void enterCriteria(SearchCriteria criteria) {
        controller.submitSearch(criteria);
    }

    public void displaySearchResults(List<Resource> resourceList) {
        System.out.println("Resources found:");
        for (Resource resource : resourceList) {
            System.out.println("- " + resource);
        }
    }

    public void displayNoResultsMessage() {
        System.out.println("No resources found for the provided criteria.");
    }

    public void displaySystemError(String errorMessage) {
        System.out.println("System error while searching resources: " + errorMessage);
    }
}
