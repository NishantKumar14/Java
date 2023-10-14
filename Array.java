import java.util.*;
class Array {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			// int arr[] = {10, 20, 25, 30, 40, 50};
			// for(int i = 0; i < arr.length; i++) {
			// 	System.out.println(arr[i]);
			// }
			int arr1[][] = new int [5][5];
			for(int i = 0; i < 5; ++i) {
				for(int j = 0; j < 5; ++j) {
					arr1[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < 5; ++i) {
				for(int j = 0; j < 5; ++j) {
					System.out.print(arr1[i][j]);
				}
			}
		}
		System.out.println();
	}
}