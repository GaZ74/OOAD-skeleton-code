package ooad.ucex02;

public class PendingExtensionRequest {
    private final String requestId;
    private final String reservationId;
    private final String userId;

    public PendingExtensionRequest(String requestId, String reservationId, String userId) {
        this.requestId = requestId;
        this.reservationId = reservationId;
        this.userId = userId;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return requestId + " | reservation=" + reservationId + " | user=" + userId;
    }
}
