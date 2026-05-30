package ooad.ucex03;

public class EligibilityCheckController {
    private ExtensionModel model;
    private EligibilityCheckView view;

    public EligibilityCheckController(ExtensionModel model) {
        this.model = model;
    }

    public void setView(EligibilityCheckView view) {
        this.view = view;
    }

    public void checkEligibility(String requestId) {
        try {
            boolean eligible = model.checkEligibility(requestId);

            if (eligible) {
                view.displayEligible();
            } else {
                view.displayNotEligible();
            }
        } catch (DatabaseException e) {
            view.displaySystemError(e.getMessage());
        }
    }
}
