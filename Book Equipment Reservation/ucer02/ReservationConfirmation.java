package ooad.ucer02;

public class ReservationConfirmation {
    private final String reservationId;
    private final String message;

    public ReservationConfirmation(String reservationId, String message) {
        this.reservationId = reservationId;
        this.message = message;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ReservationConfirmation{" +
                "reservationId='" + reservationId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
