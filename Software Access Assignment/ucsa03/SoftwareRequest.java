package ooad.ucsa03;

public class SoftwareRequest {
    private String requestId;
    private String userId;
    private String softwareId;
    private String status;

    public SoftwareRequest(String requestId, String userId, String softwareId, String status) {
        this.requestId = requestId;
        this.userId = userId;
        this.softwareId = softwareId;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getUserId() {
        return userId;
    }

    public String getSoftwareId() {
        return softwareId;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "SoftwareRequest{id='" + requestId + "', userId='" + userId + "', softwareId='" + softwareId + "', status='" + status + "'}";
    }
}
