import java.util.*;
class Student {
	String name;
	int roll_no;
	String collegeName;
	int university_rollNo;
	
	void set_detail(String name, int roll_no, String collegeName, int university_rollNo) {
		this.name = name;
		this.roll_no = roll_no;
		this.collegeName = collegeName;
		this.university_rollNo = university_rollNo;
	}

	void show_detail() {
		System.out.println("Name : " +name);
		System.out.println("Roll No. : " +roll_no);
		System.out.println("College Name : " +collegeName);
		System.out.println("University roll no. : " +university_rollNo);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student(), s2 = new Student();
		System.out.println("Enter the details of Student S1 : ");
		String name = sc.nextLine();
		int roll_no = sc.nextInt();
		collegeName = sc.nextLine();
		int university_rollNo = sc.nextInt();
		s1.set_detail(name, roll_no, collegeName, university_rollNo);
		String name1 = sc.nextLine();
		int roll_no1 = sc.nextInt();
		int university_rollNo1 = sc.nextInt();
		collegeName = sc.nextLine();
		s2.set_detail(name1, roll_no1, collegeName, university_rollNo1);
		System.out.println("Details of 1st student: ");
		s1.show_detail();
		System.out.println("Details of 2nd student: ");
		s2.show_detail();
		sc.close();
	}
}