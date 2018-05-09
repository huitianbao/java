import java.util.*;

public class zhuanzhi {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int[][] a = new int[3][4];
		int[][] b = new int[4][3];

		System.out.print("please input 12 integers:");
       //read
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = reader.nextInt();

			}
		}
      //output
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.print("\n");
		}
		
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				b[i][j]=a[j][i];
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");

			}
			System.out.print("\n");
		}
		
		
		

	}
}
