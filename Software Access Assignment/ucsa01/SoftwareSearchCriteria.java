package ooad.ucsa01;

public class SoftwareSearchCriteria {
    private final String softwareType;
    private final int licenseCount;

    public SoftwareSearchCriteria(String softwareType, int licenseCount) {
        this.softwareType = softwareType;
        this.licenseCount = licenseCount;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public int getLicenseCount() {
        return licenseCount;
    }
}
