package ooad.ucer05;

public class ApprovalDecision {
    private final String reservationId;
    private final boolean approved;
    private final String remarks;

    public ApprovalDecision(String reservationId, boolean approved, String remarks) {
        this.reservationId = reservationId;
        this.approved = approved;
        this.remarks = remarks;
    }

    public String getReservationId() {
        return reservationId;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getRemarks() {
        return remarks;
    }

    @Override
    public String toString() {
        return "ApprovalDecision{" +
                "reservationId='" + reservationId + '\'' +
                ", approved=" + approved +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
