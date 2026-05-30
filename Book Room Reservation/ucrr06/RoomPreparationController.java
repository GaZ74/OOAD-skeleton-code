package ooad.ucrr06;

public class RoomPreparationController {
    private RoomModel model;
    private RoomPreparationView view;

    public RoomPreparationController(RoomModel model) {
        this.model = model;
    }

    public void setView(RoomPreparationView view) {
        this.view = view;
    }

    public void prepareRoom(String reservationId) {
        try {
            boolean prepared = model.prepareRoom(reservationId);

            if (prepared) {
                view.displayPreparationComplete();
            } else {
                view.displayReservationNotApproved();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
