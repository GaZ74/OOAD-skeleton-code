package ooad.ucsa01;

public class SoftwareResource {
    private final String softwareId;
    private final String name;
    private final int availableLicenses;

    public SoftwareResource(String softwareId, String name, int availableLicenses) {
        this.softwareId = softwareId;
        this.name = name;
        this.availableLicenses = availableLicenses;
    }

    public String getSoftwareId() {
        return softwareId;
    }

    public String getName() {
        return name;
    }

    public int getAvailableLicenses() {
        return availableLicenses;
    }

    @Override
    public String toString() {
        return softwareId + " - " + name + " (licenses: " + availableLicenses + ")";
    }
}
