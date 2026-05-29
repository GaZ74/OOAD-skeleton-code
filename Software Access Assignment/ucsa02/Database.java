package ooad.ucsa02;

public class Database {

    public boolean saveReservation(SoftwareAccessDetails details) throws DatabaseException {
        if (details.getSoftwareId() == null || details.getSoftwareId().isBlank()) {
            throw new DatabaseException("Software id is required.");
        }

        if ("DB_ERROR".equalsIgnoreCase(details.getSoftwareId())) {
            throw new DatabaseException("Simulated database failure while saving access request.");
        }

        return true;
    }
}
