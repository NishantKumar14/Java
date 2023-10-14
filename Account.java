import java.util.*;

class Account {
	int account;
	String name;
	float amount;

	void set_detail(int account, String name, float amount) {
		this.account = account;
		this.name = name;
		this.amount = amount;
	}

	void get_Details(int account, String name, float amount) {
		System.out.println("Account : " +this.account);
		System.out.println("Name : " +this.name);
		System.out.println("Amount : " +this.amount);
	}

	void deposit(float Depo_amount) {
        this.amount = this.amount + Depo_amount; 
	}

	void display(String name, int account, float amount) {
		System.out.println("Name of account owner : " +name);
		System.out.println("Account Number : " +account);
		System.out.println("Amount in Account : " +amount);
	}
	public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        Account Ac = new Account();
		System.out.print("Account Holder Name : ");
        String name = Sc.nextLine();
		// System.out.println();
		System.out.print("Account Number : ");
        int account = Sc.nextInt();
		System.out.print("Amount in Account : ");
        float amount = Sc.nextFloat();
        Ac.set_detail(account, name, amount);
        Ac.get_Details(account, name, amount);
        Ac.deposit(amount);
        Ac.display(name, account, amount);
		System.out.print("Enter the amount to withdraw : ");
		float withDraw_Amount = Sc.nextFloat();
		if (withDraw_Amount <= amount) {
			amount = amount - withDraw_Amount;
			System.out.println("Amount after withdraw : " +amount);
		}
		else 
			System.out.println("Enter amount is excess than Actual Amount.");
        Sc.close();
    }
}