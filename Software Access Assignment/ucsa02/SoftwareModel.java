package ooad.ucsa02;

public class SoftwareModel {
    private final Database database;

    public SoftwareModel(Database database) {
        this.database = database;
    }

    public SoftwareAccessConfirmation createReservation(SoftwareAccessDetails details) throws DatabaseException {
        database.saveReservation(details);
        return new SoftwareAccessConfirmation(details.getRequestId(), details.getSoftwareId());
    }
}
