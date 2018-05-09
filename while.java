import java.util.*;

public class While{
      public static void main(String[] args){

      System.out.println("从键盘输入一个在1~100范围内的数")；

      Scanner reader=new Scanner(System.in);

      int a;

      a=reader.next();

      while(a<50|a>100){
                    System.out.println("您输入的数不属于50~100请重新输入：")；
                        }

                    System.out.println("您输入的数是"+a);

      while(a>=50&&a<=100){
                             int sum=0;
                             for(int i=1;i<=a;i++){
                                                    sum=sum+i;
                                                  }
                           }
                                            }
                    }

System.out.println("1~"+(a)"的和为"+sum);

}


