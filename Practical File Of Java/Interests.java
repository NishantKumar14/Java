class Bank {
	double getRateOfInterest() {
		double rateOfInterest = 2.0;
		return rateOfInterest;
	}
}

class Hdfc extends Bank {
	double getRateOfInterest() {
		double rateOfInterest = 4.0;
		return rateOfInterest;
	}
}

class Sbi extends Bank {
	double getRateOfInterest() {
		double rateOfInterest = 4.5;
		return rateOfInterest;
	}
}

class Pnb extends Bank { 
	double getRateOfInterest() {
		double rateOfInterest = 5.0;
		return rateOfInterest;
	}
}

class Interests {
	public static void main(String[] args) {
		// Upcasting
		Bank Bn = new Hdfc();
		System.out.print("Rate Of Interest Of HDFC Bank : " +Bn.getRateOfInterest());
		System.out.println();

		Bn = new Sbi();
		System.out.print("Rate Of Interest Of SBI Bank : " +Bn.getRateOfInterest());
		System.out.println();

		Bn = new Pnb();
		System.out.print("Rate Of Interest Of PNB Bank : " +Bn.getRateOfInterest());
		System.out.println();	
	}
}