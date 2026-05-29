package ooad.ucer02;

public class ReservationDetails {
    private final String userId;
    private final String resourceId;
    private final String reservationDate;
    private final int quantity;

    public ReservationDetails(String userId, String resourceId, String reservationDate, int quantity) {
        this.userId = userId;
        this.resourceId = resourceId;
        this.reservationDate = reservationDate;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "ReservationDetails{" +
                "userId='" + userId + '\'' +
                ", resourceId='" + resourceId + '\'' +
                ", reservationDate='" + reservationDate + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
