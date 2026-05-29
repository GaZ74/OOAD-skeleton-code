package ooad.ucer06;

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
        PreparationConfirmation confirmation = model.updateResourceStatus(reservationId, "READY");
        view.displayPreparationComplete(confirmation);
    }
}
