package ooad.ucer07;

public class ReturnConfirmation {
    private final String reservationId;
    private final String status;

    public ReturnConfirmation(String reservationId, String status) {
        this.reservationId = reservationId;
        this.status = status;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ReturnConfirmation{" +
                "reservationId='" + reservationId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
