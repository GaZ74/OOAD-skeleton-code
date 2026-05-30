package ooad.ucrr05;

public class RoomReservation {
    private String reservationId;
    private String roomName;
    private String status;

    public RoomReservation(String reservationId, String roomName, String status) {
        this.reservationId = reservationId;
        this.roomName = roomName;
        this.status = status;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "RoomReservation{id='" + reservationId + "', room='" + roomName + "', status='" + status + "'}";
    }
}
