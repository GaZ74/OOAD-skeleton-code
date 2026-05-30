package ooad.ucex05;

public class ExtensionRequest {
    private String requestId;
    private String userId;
    private String reservationId;
    private String status;

    public ExtensionRequest(String requestId, String userId, String reservationId, String status) {
        this.requestId = requestId;
        this.userId = userId;
        this.reservationId = reservationId;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getUserId() {
        return userId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ExtensionRequest{id='" + requestId + "', userId='" + userId + "', reservationId='" + reservationId + "', status='" + status + "'}";
    }
}
