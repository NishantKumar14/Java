import java.util.Scanner;

public class StudentInfo {
	String name;
	int id;
	String branch;
	static String university = "GEHU";

	public void getDetails (String name, int id, String branch) {
		this.name = name;
		this.id = id;
		this.branch = branch;
	}

	public void showDetails (String name, int id, String branch, String university) {
		System.out.println();
		System.out.println("Name : " +name);
		System.out.println("Student Id. : " +id);
		System.out.println("Branch Name : " +branch);
		System.out.println("University Name : " +university);
	}

	public static void main (String[] args) {
		try (Scanner Sc = new Scanner(System.in)) {
			StudentInfo St = new StudentInfo();
			System.out.print("Enter the Student Name : ");
			String name = Sc.nextLine();
			System.out.print("Enter the Student Id : ");
			int id = Sc.nextInt();
			Sc.nextLine();
			System.out.print("Enter the Student Branch : ");
			String branch = Sc.nextLine();
			St.getDetails(name, id, branch);
			St.showDetails(name, id, branch, university);
		}
	}
}