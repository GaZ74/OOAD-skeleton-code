package ooad.ucrr03;

public class PendingReservation {
    private final String reservationId;
    private final String roomId;
    private final String userId;

    public PendingReservation(String reservationId, String roomId, String userId) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.userId = userId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return reservationId + " | room=" + roomId + " | user=" + userId;
    }
}
