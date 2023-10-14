import java.util.Scanner;

public class Employee {
	int id;
	String name;
	String department;
	int salary;

	public void getDetails(int Id, String employeeName, String dep, int sal) {
		id = Id;
		name = employeeName;
		department = dep;
		salary = sal;
	}

	public void showDetails() {
		System.out.println();
		System.out.println("Id : " +id);
		System.out.println("Name : " +name);
		System.out.println("Department : " +department);
		System.out.println("Salary : " +salary);
	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		Employee Em = new Employee();
		System.out.print("Enter the Employee Id : ");
		int Id = Sc.nextInt();
		Sc.nextLine();
		System.out.print("Enter the Employee name : ");
		String employeeName = Sc.nextLine();
		System.out.print("Enter the Employee Department : ");
		String dep = Sc.nextLine();
		// Sc.nextLine();
		System.out.print("Enter the Employee Salary : ");
		int sal = Sc.nextInt();

		Em.getDetails(Id, employeeName, dep, sal);
		Em.showDetails();
	}
}