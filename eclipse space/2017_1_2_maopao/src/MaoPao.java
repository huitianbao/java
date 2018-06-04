
public class MaoPao {
	// succeed   2017_1_2
	
	//不足，没能把 swap封装成函数
	
	
	public static void main(String[] args){

		int []a=new int [20];
		for(int j=0;j<20;j++){
			System.out.println("第"+(j+1)+"次");
	
	
	for(int i=0;i<20;i++){
		a[i]=(int)(Math.random()*100+1);
	}
	
	for(int i=0;i<20;i++){
		System.out.print(a[i]+"  ");              //a[i]=(int)(Math.random()*100+1);
	}
	
	System.out.println();  
	
	int num=20;int tmp;
	while(num>1){
		for(int i=0;i<num-1;i++){
			if(a[i]>a[i+1]){
				//tmp=a[i];a[i]=a[i+1];a[i+1]=tmp;         // yes the problem is the    constructor  swap()  2017_1_2
				swap(a[i],a[i+1]);
			}
		}
		num--;
	}
	
	
	
	for(int i=0;i<20;i++){
		System.out.print(a[i]+"  ");              //a[i]=(int)(Math.random()*100+1);
	}
	
	System.out.println();
		}
		
		
	
}

	int tmp;
	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		tmp=a[i];a[i]=a[i+1];a[i+1]=tmp;
		
		
	}
	
	
	
}
