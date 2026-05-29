package ooad.ucer02;

public class EquipmentModel {
    private final Database database;

    public EquipmentModel(Database database) {
        this.database = database;
    }

    public ReservationConfirmation createReservation(ReservationDetails details) throws DatabaseException {
        boolean success = database.saveReservation(details);

        if (!success) {
            throw new DatabaseException("Reservation could not be saved.");
        }

        String reservationId = "RES-" + System.currentTimeMillis();
        return new ReservationConfirmation(reservationId, "Reservation submitted successfully.");
    }
}
