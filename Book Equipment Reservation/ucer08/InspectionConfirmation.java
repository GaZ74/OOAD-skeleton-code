package ooad.ucer08;

public class InspectionConfirmation {
    private final String inspectionId;
    private final String result;

    public InspectionConfirmation(String inspectionId, String result) {
        this.inspectionId = inspectionId;
        this.result = result;
    }

    public String getInspectionId() {
        return inspectionId;
    }

    public String getResult() {
        return result;
    }
}
