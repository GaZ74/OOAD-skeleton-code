package ooad.ucrr05;

public class Database {
    public RoomReservation findHighValueRoomReservation(String reservationId) throws DatabaseException {
        if ("DB_ERROR".equals(reservationId)) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        if ("RR-HIGH".equals(reservationId)) {
            return new RoomReservation("RR-HIGH", "Conference Room A", "WAITING_MANAGER_APPROVAL");
        }

        if ("RR-SENSITIVE".equals(reservationId)) {
            return new RoomReservation("RR-SENSITIVE", "VIP Meeting Room", "WAITING_MANAGER_APPROVAL");
        }

        return null;
    }

    public boolean updateApprovalStatus(ApprovalDecision decision) throws DatabaseException {
        if ("DB_ERROR".equals(decision.getReservationId())) {
            throw new DatabaseException("Simulated database connectivity issue.");
        }

        return true;
    }
}
