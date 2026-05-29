package ooad.ucer04;

public class ResourceValue {
    private final String reservationId;
    private final double amount;

    public ResourceValue(String reservationId, double amount) {
        this.reservationId = reservationId;
        this.amount = amount;
    }

    public String getReservationId() {
        return reservationId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "ResourceValue{" +
                "reservationId='" + reservationId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
