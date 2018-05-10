import java.util.*;

public class ja3 {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		System.out.println("please input 9 integers:");

		Scanner reader = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = reader.nextInt();

			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println("\n");
		}

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j || (i + j == 2))
					sum = sum + a[i][j];

			}
		}
		sum=sum-a[1][1];
		
		
		System.out.println("主对角线和副对角线之和是"+sum);
		

	}

}
