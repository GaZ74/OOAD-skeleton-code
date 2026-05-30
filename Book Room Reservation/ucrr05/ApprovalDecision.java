package ooad.ucrr05;

public class ApprovalDecision {
    private String reservationId;
    private boolean approved;

    public ApprovalDecision(String reservationId, boolean approved) {
        this.reservationId = reservationId;
        this.approved = approved;
    }

    public String getReservationId() {
        return reservationId;
    }

    public boolean isApproved() {
        return approved;
    }
}
