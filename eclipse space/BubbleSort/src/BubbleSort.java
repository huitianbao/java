import java.util.Random;
public class BubbleSort {

	


	//����20��
		public static void main(String[] args) {
			
			int a[] = new int[20];
			
			for(int k=1;k<20;k++){
			for (int i = 0; i < 20; i++) {

				a[i] = new Random().nextInt(100) + 1;

			}

			
			
			for (int i = 0; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println();

			int tmp;
			
			for (int j = 0; j < a.length; j++) {
				for (int i = 0; i < a.length - 1; i++) {
					if (a[i] > a[i + 1]) {
					
						tmp=a[i];
						a[i]=a[i+1];
						a[i+1]=tmp;
						//swap(a[i],a[i+1]);  Ϊʲôд��һ�������ͳ���
					}
				}
			}

			for (int i = 0; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println();
			System.out.println();
			System.out.println();
			
			}
			
			

		}

		/*
		public static void swap(int a, int b) {
			int tmp;
			tmp = a;
			a = b;
			b = tmp;
		}
		*/
		

	}


