package ooad.ucex01;

public class ExtensionRequestDetails {
    private final String requestId;
    private final String reservationId;
    private final String userId;
    private final int extensionDays;

    public ExtensionRequestDetails(String requestId, String reservationId, String userId, int extensionDays) {
        this.requestId = requestId;
        this.reservationId = reservationId;
        this.userId = userId;
        this.extensionDays = extensionDays;
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

    public int getExtensionDays() {
        return extensionDays;
    }
}
