package ooad.ucer05;

public class EquipmentModel {
    private final Database database;

    public EquipmentModel(Database database) {
        this.database = database;
    }

    public ApprovalDecision recordApprovalDecision(ApprovalDecision decision) {
        database.updateApprovalStatus(decision);
        return decision;
    }
}
