import java.util.*;

public class ReWeiShuZu {
public static void main(String[] args){
	
	Scanner reader=new Scanner(System.in);
	
	int a[][]=new int[3][4];
	System.out.println("please input 3x4 integers:");
	
	for(int i=0;i<3;i++){
		for(int j=0;j<4;j++){
			a[i][j]=reader.nextInt();
		}
	}
	
	System.out.println(" an  hang");
	for(int i=0;i<3;i++){
		for(int j=0;j<4;j++){
			System.out.print(a[i][j]+"   ");
		}
		System.out.println();
		
	}
	
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	System.out.println(" an  lie");    //3  4
	for(int h=0;h<4;h++){
		for(int l=0;l<3;l++){
			System.out.print(a[h][l]+"   ");////////////////////////////////////////////////////////////////c
		}
	}
	
	
	
	
	
	/*
	int sum=0;int su=0;
	
	for(int i=0;i<3;i++){
		for(int j=0;j<4;j++){
			System.out.print(a[i][j]+"   ");
			sum=sum+a[i][j];
			//su=su+a[j][i];
			
		}
        System.out.print(sum);
        
		System.out.println();
	}
	
	for(int j=0;j<4;j++){
		for(int i=0;i<3;i++){
			su=su+a[j][i];
		}
	}
	
	System.out.print(su+"   ");
	
	*/
	
	
	
	
	
	
	
	
}
}
