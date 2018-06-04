import java.util.Random;

public class QuickSort {

	
	
	public QuickSort(){}
	
	public static Integer[] qsort(Integer[] data){
		do_qsort(data,0,data.length-1);
		return data;
	}
	
	
	private static int getPoint(Integer[] data,int start,int end){
		
		
		return start;
	}
	
	private static void swap(Integer[] data,int i,int j){
		Integer tmp;
		tmp=data[i];
		data[i]=data[j];
		data[j]=tmp;
	}
	
	
	private static void do_qsort(Integer[] data,int start,int end){
		if(start>=end){
			return;
		}
		
		
		
		
		
		int pivot=getPoint(data,start,end);
		
		swap(data,start,end);
		int i=start;
		int j=end;
		
		while(i<=j){
			for(;data[i]<pivot&&i<=j;i++){
				for(;data[j]>=pivot&&i<j;j++){
					swap(data,i,j);
					
					swap(data,start,j);
					swap(data,start,j-1);
					do_qsort(data,j+1,end);
					
				}
			}
		}
	}
	
	
	
	private Integer data[];
	
	public static void main(String[] args){
		Integer a[]=new Integer[20];
		
		for(int k=1;k<20;k++){
			for (int i = 0; i < 20; i++) {

				a[i] = new Random().nextInt(100) + 1;

			}
			
			for (int i = 0; i < a.length; i++) {
				System.out.print(" " + a[i]);
			}
		
	}
		QuickSort quicksort=new QuickSort();
		quicksort.qsort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		
		
		
		
	}
}
		
		
	
	
	

