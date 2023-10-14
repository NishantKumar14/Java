import java.util.Scanner;

public class Jagged {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[6];

		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				System.out.print("Enter the Value : ");
				int val = Sc.nextInt();
				arr[i][j] = val;
			}
		}
		
		System.out.println("Jagged Array : ");
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}