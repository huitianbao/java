import java.util.*;

public class InputNum
{
public static void main(String[] args)
{
int a=0;
float b=0F;
double c=0D;
String s="";
Scanner reader=new Scanner(System.in);

System.out.println("�Ӽ�������һ���ַ�");

s=reader.nextLine();

System.out.println("��������ַ�����"+s);

System.out.println("�Ӽ�������һ��������");
a=reader.nextInt();

System.out.println("�������������:"+a);


System.out.println("�Ӽ�������һ�������ȸ�������");
b=reader.nextFloat();
System.out.println("������ĵ����ȸ�������"+b);

System.out.println("�Ӽ�������һ��˫���ȸ�������");
c=reader.nextDouble();
System.out.println("�������˫���ȸ�������"+c);

}
}
