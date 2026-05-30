package ooad.ucsa05;

public class SoftwareRequest {
    private String requestId;
    private String softwareName;
    private String status;

    public SoftwareRequest(String requestId, String softwareName, String status) {
        this.requestId = requestId;
        this.softwareName = softwareName;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "SoftwareRequest{id='" + requestId + "', software='" + softwareName + "', status='" + status + "'}";
    }
}