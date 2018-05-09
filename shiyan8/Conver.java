public class Conver
{
public static void main(String[] args)
{
byte a=0;
short b=0;
int c=0;
long d=0;
float e=0F;
double f=0D;
String s="10";

//字符串转换成数值型
a=Byte.parseByte(s);
System.out.println("a="+a);

b=Short.parseShort(s);
System.out.println("b="+b);


c=Integer.parseInt(s);
System.out.println("c="+c);

d=Long.parseLong(s);
System.out.println("d="+d);

e=Float.parseFloat(s);
System.out.println("e="+e);

f=Double.parseDouble(s);
System.out.println("f="+f);

int MyInt=1234;
String MyString=""+MyInt;
}
}

