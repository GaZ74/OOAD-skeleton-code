package ooad.ucex01;

public class ExtensionRequestConfirmation {
    private final String requestId;
    private final String reservationId;

    public ExtensionRequestConfirmation(String requestId, String reservationId) {
        this.requestId = requestId;
        this.reservationId = reservationId;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getReservationId() {
        return reservationId;
    }
}
