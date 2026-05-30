package ooad.ucrr07;

public class RoomModel {
    private Database database;

    public RoomModel(Database database) {
        this.database = database;
    }

    public boolean acknowledgeReturn(String reservationId) throws DatabaseException {
        String status = database.getRoomUsageStatus(reservationId);

        if (!"IN_USE".equals(status)) {
            return false;
        }

        return database.updateRoomReturnStatus(reservationId);
    }
}
