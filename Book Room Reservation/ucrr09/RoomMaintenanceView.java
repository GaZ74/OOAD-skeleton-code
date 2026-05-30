package ooad.ucrr09;

public class RoomMaintenanceView {
    private RoomMaintenanceController controller;

    public RoomMaintenanceView(RoomMaintenanceController controller) {
        this.controller = controller;
    }

    public void submitMaintenanceReport(RoomMaintenanceReport report) {
        System.out.println("\nTechnician submits room maintenance report for: " + report.getReservationId());
        controller.processMaintenanceReport(report);
    }

    public void displayMaintenanceScheduled(String message) {
        System.out.println("Room maintenance required.");
        System.out.println(message);
    }

    public void displayProcessCompleted(String message) {
        System.out.println("No room maintenance required.");
        System.out.println(message);
    }

    public void displayValidationError() {
        System.out.println("Maintenance report is invalid. Please enter report description.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while processing room maintenance report: " + message);
    }
}