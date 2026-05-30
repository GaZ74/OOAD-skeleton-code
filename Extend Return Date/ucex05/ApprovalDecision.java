package ooad.ucex05;

public class ApprovalDecision {
    private String requestId;
    private boolean approved;

    public ApprovalDecision(String requestId, boolean approved) {
        this.requestId = requestId;
        this.approved = approved;
    }

    public String getRequestId() {
        return requestId;
    }

    public boolean isApproved() {
        return approved;
    }
}
