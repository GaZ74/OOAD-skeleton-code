package ooad.ucsa02;

public class SoftwareAccessConfirmation {
    private final String requestId;
    private final String softwareId;

    public SoftwareAccessConfirmation(String requestId, String softwareId) {
        this.requestId = requestId;
        this.softwareId = softwareId;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getSoftwareId() {
        return softwareId;
    }
}
