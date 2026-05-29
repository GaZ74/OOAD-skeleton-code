package ooad.ucsa02;

public class SoftwareAccessDetails {
    private final String requestId;
    private final String softwareId;
    private final String userId;

    public SoftwareAccessDetails(String requestId, String softwareId, String userId) {
        this.requestId = requestId;
        this.softwareId = softwareId;
        this.userId = userId;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getSoftwareId() {
        return softwareId;
    }

    public String getUserId() {
        return userId;
    }
}
