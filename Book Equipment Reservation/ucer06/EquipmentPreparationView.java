package ooad.ucer06;

public class EquipmentPreparationView {
    private final EquipmentPreparationController controller;

    public EquipmentPreparationView(EquipmentPreparationController controller) {
        this.controller = controller;
    }

    public void startPreparation(String reservationId) {
        controller.prepareResource(reservationId);
    }

    public void displayPreparationComplete(PreparationConfirmation confirmation) {
        System.out.println("Preparation complete for reservation: " + confirmation.getReservationId());
        System.out.println("Status: " + confirmation.getStatus());
    }
}
