import java.util.Scanner;

public class Employee {
    int Id;
    String name;
    String department;
    int salary;
 
    void getDetails(String name, int Id, String department, int salary) {
        this.Id = Id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void showDetails(String name, int Id, String department, int salary) {
        System.out.println("******************************************************");
        System.out.println("Employee name : " +name);
        System.out.println("Employee Id : " +Id);
        System.out.println("Employee Department : " +department);
        System.out.println("Employee Salary : " +salary);
    }

    public static void main(String args[]) {
        try (Scanner Sc = new Scanner(System.in)) {
            Employee Emp = new Employee();
            System.out.print("Enter the name : ");
            String name = Sc.nextLine();
            System.out.print("Enter the Employee Id : ");
            int Id = Sc.nextInt();
            Sc.nextLine() ;
            System.out.print("Enter the Department of the Employee : ");
            String department = Sc.nextLine();
            System.out.println();
            System.out.print("Enter the salary of the Employee : ");
            int salary = Sc.nextInt();
            Emp.getDetails(name, Id, department, salary);
            Emp.showDetails(name, Id, department, salary);
        }
    }
}