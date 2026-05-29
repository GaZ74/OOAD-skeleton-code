package ooad.ucex01;

public class ExtensionModel {
    private final Database database;

    public ExtensionModel(Database database) {
        this.database = database;
    }

    public ExtensionRequestConfirmation createReservation(ExtensionRequestDetails details) throws DatabaseException {
        database.saveReservation(details);
        return new ExtensionRequestConfirmation(details.getRequestId(), details.getReservationId());
    }
}
