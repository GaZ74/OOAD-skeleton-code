package ooad.ucrr07;

public class RoomReturnController {
    private RoomModel model;
    private RoomReturnView view;

    public RoomReturnController(RoomModel model) {
        this.model = model;
    }

    public void setView(RoomReturnView view) {
        this.view = view;
    }

    public void acknowledgeReturn(String reservationId) {
        try {
            boolean returned = model.acknowledgeReturn(reservationId);

            if (returned) {
                view.displayReturnAcknowledged();
            } else {
                view.displayInvalidReturn();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
