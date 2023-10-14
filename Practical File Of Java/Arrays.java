import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		try (Scanner Sc = new Scanner(System.in)) {
			System.out.print("Enter the Number of Rows : ");
			int row = Sc.nextInt();
			System.out.print("Enter the number of Column : ");
			int column = Sc.nextInt();

			int arr[][] = new int[row][column];
			for (int i = 0; i < row; ++i) {
				for (int j = 0; j < column; ++j) {
					System.out.print("Enter the element : ");
					int val = Sc.nextInt();
					arr[i][j] = val;
				}
			}

			System.out.println("After Enter the element in Array : ");
			for (int i = 0; i < row; ++i) {
				for (int j = 0; j < column; ++j) {
					System.out.print(arr[i][j] +" ");
				}
				System.out.println(" ");
			}

			System.out.print("Enter the element to be Search : ");
			int num = Sc.nextInt();
			for (int i = 0; i < row; ++i) {
				for (int j = 0; j < column; ++j) {
					if (arr[i][j] == num) {
						System.out.println("Element Found : " +num);
						break;
					}
				}
			}
		}
	}
}