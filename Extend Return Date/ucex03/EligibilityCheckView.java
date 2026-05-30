package ooad.ucex03;

public class EligibilityCheckView {
    private EligibilityCheckController controller;

    public EligibilityCheckView(EligibilityCheckController controller) {
        this.controller = controller;
    }

    public void checkEligibility(String requestId) {
        System.out.println("\nFront-desk staff checks eligibility for extension request: " + requestId);
        controller.checkEligibility(requestId);
    }

    public void displayEligible() {
        System.out.println("User is eligible for return date extension.");
    }

    public void displayNotEligible() {
        System.out.println("User is not eligible for return date extension.");
    }

    public void displaySystemError(String message) {
        System.out.println("System error while checking eligibility: " + message);
    }
}
