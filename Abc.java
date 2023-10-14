import java.util.*;
class Abc {
	String Name;
	String Stdander;
	String Section;
	int RollNo;
	String schoolName ;

	void get_Details(String Name, String Stdander, String Section, int RollNo, String SchoolName) {
		this.Name = Name;
		this.Stdander = Stdander;
		this.Section = Section;
		this.RollNo = RollNo;
		this.schoolName = SchoolName;
	}

	void show_Details() {
		System.out.println("Name of Student : " +Name);
		System.out.println("Class : " +Stdander);
		System.out.println("Section : " +Section);
		System.out.println("Roll Number Of Student : " +RollNo);
		System.out.println("Name of School : " +schoolName);
	}

	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			Abc Ab = new Abc();
			System.out.print("Enter the name : ");
			String Name = sc.nextLine();
			System.out.print("Class : ");
			String Stdander = sc.nextLine();
			System.out.print("Section : ");
			String Section = sc.nextLine();
			// System.out.println();
			System.out.print("Roll Number : ");
			int RollNo = sc.nextInt();
			// System.out.println();
			System.out.print("School Name : ");
			String SchoolName = sc.nextLine();
			System.out.println();
			Ab.get_Details(Name, Stdander, Section, RollNo, SchoolName);
			Ab.show_Details();
		}
	}
}