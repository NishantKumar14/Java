import java.util.Scanner;

public class Student {
	String name;
	int id;
	String branch;
	String university;

	public void getDetails (String stName, int stId, String stBranch, String stUniversity) {
		name = stName;
		id = stId;
		branch = stBranch;
		university = stUniversity;
	}

	public void showDetails (String stName, int stId, String stBranch, String stUniversity) {
		System.out.println("Name : " +stName);
		System.out.println("Student Id. : " +stId);
		System.out.println("Branch Name : " +stBranch);
		System.out.println("University Name : " +stUniversity);
	}

	public static void main (String[] args) {
		try (Scanner Sc = new Scanner(System.in)) {
			Student St = new Student();
			System.out.print("Enter the Student Name : ");
			String stName = Sc.nextLine();
			System.out.print("Enter the Student Id : ");
			int stId = Sc.nextInt();
			Sc.nextLine();
			System.out.print("Enter the Student Branch : ");
			String stBranch = Sc.nextLine();
			System.out.print("Enter the University Name: ");
			String stUniversity = Sc.nextLine();

			St.getDetails(stName, stId, stBranch, stUniversity);
			St.showDetails(stName, stId, stBranch, stUniversity);
		}
	}
}