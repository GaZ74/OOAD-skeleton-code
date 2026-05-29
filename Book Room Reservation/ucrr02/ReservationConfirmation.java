package ooad.ucrr02;

public class ReservationConfirmation {
    private final String reservationId;
    private final String roomId;

    public ReservationConfirmation(String reservationId, String roomId) {
        this.reservationId = reservationId;
        this.roomId = roomId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getRoomId() {
        return roomId;
    }
}
