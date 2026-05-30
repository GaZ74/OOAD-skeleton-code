package ooad.ucrr07;

public class RoomReturnView {
    private RoomReturnController controller;

    public RoomReturnView(RoomReturnController controller) {
        this.controller = controller;
    }

    public void acknowledgeReturn(String reservationId) {
        System.out.println("\nFront-desk staff acknowledges room return for: " + reservationId);
        controller.acknowledgeReturn(reservationId);
    }

    public void displayReturnAcknowledged() {
        System.out.println("Room return acknowledged successfully.");
    }

    public void displayInvalidReturn() {
        System.out.println("Cannot acknowledge return because room is not currently in use.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while acknowledging room return: " + message);
    }
}
