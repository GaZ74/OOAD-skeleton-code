package ooad.ucrr04;

public class RoomValueAssessmentView {
    private RoomValueAssessmentController controller;

    public RoomValueAssessmentView(RoomValueAssessmentController controller) {
        this.controller = controller;
    }

    public void selectReservation(String reservationId) {
        System.out.println("\nFront-desk staff checks room value for: " + reservationId);
        controller.evaluateReservation(reservationId);
    }

    public void displayManagerApprovalRequired() {
        System.out.println("This room reservation requires manager approval.");
    }

    public void displayTechnicianRouting() {
        System.out.println("This room reservation can be routed to technician for preparation.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while checking room value: " + message);
    }
}
