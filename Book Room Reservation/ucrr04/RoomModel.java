package ooad.ucrr04;

public class RoomModel {
    private Database database;

    public RoomModel(Database database) {
        this.database = database;
    }

    public String assessRoomValue(String reservationId) throws DatabaseException {
        return database.getRoomValue(reservationId);
    }
}