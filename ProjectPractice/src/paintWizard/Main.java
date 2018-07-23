package paintWizard;

public class Main {

	public static void main(String[] args) {
		Logic logic = new Logic();
		System.out.println(logic.calculateBestCoverage(30));
		System.out.println(logic.calculateRemainingCost(30));

	}

}
