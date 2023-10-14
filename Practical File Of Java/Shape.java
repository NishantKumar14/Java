import java.util.Scanner;

public class Shape {
	int length, breadth, side;
	double radius;

	public void Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		int area = (this.length) * (this.breadth);
		System.out.println("The area of Rectangle : " +area);
		System.out.println(" ");
	}

	public void Area(int side) {
		this.side = side;
		int area = (this.side) * (this.side);
		System.out.println("The area of Square : " +area);
		System.out.println(" ");
	}

	public void Area(double radius) {
		this.radius = radius;
		double area = (3.14 * (this.radius) * (this.radius));
		System.out.println("The area of Circle : " +area);
		// System.out.println(" ");
	}

	public static void main(String[] args) {
		try (Scanner Sc = new Scanner(System.in)) {
			Shape Sp = new Shape();

			System.out.print("Enter the length of Rectangle : ");
			int length = Sc.nextInt();
			System.out.print("Enter the breadth of Rectangle : ");
			int breadth = Sc.nextInt();
			Sp.Area(length, breadth);
			System.out.print("Enter the Side Of Square : ");
			int side = Sc.nextInt();
			Sp.Area(side);
			System.out.print("Enter the radius of Circle : ");
			double radius = Sc.nextDouble();
			Sp.Area(radius);
		}
	}
}