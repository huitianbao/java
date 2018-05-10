import java.util.*;

public class ja4 {
	public static void main(String[] arge) {

		Scanner reader = new Scanner(System.in);
		System.out.println("please input 20 integers:");

		int[][] a = new int[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = reader.nextInt();
			}
		}

		int min = a[0][0];
		int max = a[0][0];
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		int index4 = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					index1 = i;
					index2 = j;
				}
				if (a[i][j] < min) {
					min = a[i][j];
					index3 = i;
					index4 = j;

				}

			}
	}
		System.out.println("max="+max+" "+"hang index="+index1+" "+"lie index="+index2+"\n"+"min="+min+" "+"hang index="+index3+" "+"lie index="+index4);
		

	}
}
