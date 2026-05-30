package ooad.ucrr05;

public class RoomModel {
    private Database database;

    public RoomModel(Database database) {
        this.database = database;
    }

    public RoomReservation getHighValueRoomReservation(String reservationId) throws DatabaseException {
        return database.findHighValueRoomReservation(reservationId);
    }

    public boolean recordApprovalDecision(ApprovalDecision decision) throws DatabaseException {
        return database.updateApprovalStatus(decision);
    }
}
