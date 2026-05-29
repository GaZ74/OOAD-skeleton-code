package ooad.ucsa01;

import java.util.List;

public class SoftwareSearchView {
    private final SoftwareSearchController controller;

    public SoftwareSearchView(SoftwareSearchController controller) {
        this.controller = controller;
    }

    public void enterSearchCriteria(SoftwareSearchCriteria criteria) {
        controller.submitSearch(criteria);
    }

    public void displaySearchResults(List<SoftwareResource> resourceList) {
        System.out.println("Resources found:");
        for (SoftwareResource resource : resourceList) {
            System.out.println("- " + resource);
        }
    }

    public void displayNoResultsMessage() {
        System.out.println("No resources found for the provided criteria.");
    }

    public void displaySystemError(String errorMessage) {
        System.out.println("System error while searching software resources: " + errorMessage);
    }
}
