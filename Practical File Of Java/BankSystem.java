import java.util.Scanner;

public class BankSystem {
	String accountName;
	String bankName;
	String accountNo;
	double balance;

	public void getDetails(String accountName, String bankName, String accountNo, double balance) {
		this.accountName = accountName;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public double depositAmt(double depositAmount) {
		balance = balance + depositAmount;
		return balance;
	}

	public void withdraw(double withdrawalAmount) {
		balance = balance - withdrawalAmount;
	}

	public void showDetails() {
		System.out.println("Account Name : " +accountName);
		System.out.println("Bank Name : " +bankName);
		System.out.println("Account Number : " +accountNo);
		System.out.println("Amount in Account : " +balance);
	}

	public static void main(String[] args) {
		try (Scanner Sc = new Scanner(System.in)) {
			BankSystem  Bs = new BankSystem();
			System.out.print("Enter the Account Holder Name : ");
			String accountName = Sc.nextLine();
			System.out.print("Enter the Bank Name : ");
			String bankName = Sc.nextLine();
			System.out.print("Enter the account Number : ");
			String accountNo = Sc.nextLine();
			System.out.print("Enter the Balance : ");
			double balance = Sc.nextDouble();
			System.out.println();

			Bs.getDetails(accountName, bankName, accountNo, balance);
			Bs.showDetails();
			System.out.println();

			System.out.print("Enter the amount for deposit : ");
			double depositAmount = Sc.nextDouble();
			double ans = Bs.depositAmt(depositAmount);
			Bs.showDetails();
			System.out.println();

			System.out.print("Enter the amount for withdrawal : ");
			double withdrawalAmount = Sc.nextDouble();
			if (withdrawalAmount < ans) {
				System.out.println("Amount is Available for withdrawal.....");
				Bs.withdraw(withdrawalAmount);
				Bs.showDetails();
				System.out.println();
			}
			else {
				System.out.println("Insufficiant Balance!!!!!!");
			}
		}
	}
}