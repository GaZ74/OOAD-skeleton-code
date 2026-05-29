package ooad.ucer06;

public class PreparationConfirmation {
    private final String reservationId;
    private final String status;

    public PreparationConfirmation(String reservationId, String status) {
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
        return "PreparationConfirmation{" +
                "reservationId='" + reservationId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
