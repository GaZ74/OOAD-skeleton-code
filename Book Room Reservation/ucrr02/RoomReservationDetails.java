package ooad.ucrr02;

public class RoomReservationDetails {
    private final String reservationId;
    private final String roomId;
    private final String userId;

    public RoomReservationDetails(String reservationId, String roomId, String userId) {
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
}
