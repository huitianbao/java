import java.util.*;
public class IfSentence
{
public static void main(String[] args)
{
int a=0,b=0,c=0,max=0;
Scanner reader=new Scanner(System.in);
System.out.println("�Ӽ��������һ��������");
a=reader.nextInt();


System.out.println("�Ӽ�������ڶ���������");
b=reader.nextInt();


System.out.println("�Ӽ������������������");
c=reader.nextInt();

//a>b?(max=a):(max=b);

if(a>b)
{
max=a;
}
else
max=b;

if(c>max)
max=c;


System.out.println("�������ǣ�"+max);
}

}

