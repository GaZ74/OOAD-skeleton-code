package ooad.ucrr06;

public class RoomModel {
    private Database database;

    public RoomModel(Database database) {
        this.database = database;
    }

    public boolean prepareRoom(String reservationId) throws DatabaseException {
        String reservationStatus = database.getReservationStatus(reservationId);

        if (!"APPROVED".equals(reservationStatus)) {
            return false;
        }

        return database.updateRoomStatus(reservationId, "READY");
    }
}
