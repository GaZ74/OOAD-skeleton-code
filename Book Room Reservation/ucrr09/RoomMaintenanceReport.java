package ooad.ucrr09;

public class RoomMaintenanceReport {
    private String reservationId;
    private String description;
    private boolean faultFound;

    public RoomMaintenanceReport(String reservationId, String description, boolean faultFound) {
        this.reservationId = reservationId;
        this.description = description;
        this.faultFound = faultFound;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFaultFound() {
        return faultFound;
    }

    @Override
    public String toString() {
        return "RoomMaintenanceReport{reservationId='" + reservationId + "', description='" + description + "', faultFound=" + faultFound + "}";
    }
}