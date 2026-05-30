package ooad.ucrr08;

public class RoomInspectionResult {
    private String reservationId;
    private String notes;
    private boolean issueFound;

    public RoomInspectionResult(String reservationId, String notes, boolean issueFound) {
        this.reservationId = reservationId;
        this.notes = notes;
        this.issueFound = issueFound;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getNotes() {
        return notes;
    }

    public boolean isIssueFound() {
        return issueFound;
    }

    @Override
    public String toString() {
        return "RoomInspectionResult{reservationId='" + reservationId + "', notes='" + notes + "', issueFound=" + issueFound + "}";
    }
}
