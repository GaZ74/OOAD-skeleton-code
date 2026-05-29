package ooad.ucer07;

public class EquipmentPreparationController {
    private final EquipmentModel model;
    private EquipmentPreparationView view;

    public EquipmentPreparationController(EquipmentModel model) {
        this.model = model;
    }

    public void setView(EquipmentPreparationView view) {
        this.view = view;
    }

    public void prepareResource(String reservationId) {
        ReturnConfirmation confirmation = model.updateResourceStatus(reservationId, "RETURNED");
        view.displayPreparationComplete(confirmation);
    }
}
