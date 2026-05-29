package ooad.ucer03;

public class PendingReservation {
    private final String reservationId;
    private final String userId;
    private final String resourceId;
    private final String reservationDate;
    private final String status;

    public PendingReservation(String reservationId, String userId, String resourceId, String reservationDate, String status) {
        this.reservationId = reservationId;
        this.userId = userId;
        this.resourceId = resourceId;
        this.reservationDate = reservationDate;
        this.status = status;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getUserId() {
        return userId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "PendingReservation{" +
                "reservationId='" + reservationId + '\'' +
                ", userId='" + userId + '\'' +
                ", resourceId='" + resourceId + '\'' +
                ", reservationDate='" + reservationDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
