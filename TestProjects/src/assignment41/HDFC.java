package assignment41;

interface Rbi {
	double r = 8;

	void recurringDeposit(double depositAmount, double duration);

}

class HDFC implements Rbi {
	double depositAmount, duration, maturityAmount;

	public void recurringDeposit(double p, double t) {
		this.depositAmount = p;
		this.duration = t;

		maturityAmount = p * t + p * ((t * (t + 1)) / 2) * (r / 100) * (1 / 12);

		System.out.println("Maturity Amount: " + maturityAmount);
	}

	public static void main(String args[]) {
		HDFC h = new HDFC();
		h.recurringDeposit(50000, 12);

	}

}
