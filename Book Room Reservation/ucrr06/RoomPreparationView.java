package ooad.ucrr06;

public class RoomPreparationView {
    private RoomPreparationController controller;

    public RoomPreparationView(RoomPreparationController controller) {
        this.controller = controller;
    }

    public void startPreparation(String reservationId) {
        System.out.println("\nTechnician starts preparing room for: " + reservationId);
        controller.prepareRoom(reservationId);
    }

    public void displayPreparationComplete() {
        System.out.println("Room prepared and marked as READY.");
    }

    public void displayReservationNotApproved() {
        System.out.println("Cannot prepare room because reservation is not approved.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while preparing room: " + message);
    }
}
