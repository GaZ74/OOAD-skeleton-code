package ooad.ucrr02;

public class RoomModel {
    private final Database database;

    public RoomModel(Database database) {
        this.database = database;
    }

    public ReservationConfirmation createReservation(RoomReservationDetails details) throws DatabaseException {
        database.saveReservation(details);
        return new ReservationConfirmation(details.getReservationId(), details.getRoomId());
    }
}
