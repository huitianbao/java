
//class Main.java


abstract class Shape{
         protected String name;
         public Shape(String xm){
                name=xm;
                System.out.println("����"+name);
                                 }


abstract public double getArea();
abstract public double getLength();

                     }



class Triangle extends Shape{

      private double a;
      private double b;
      private double c;

      public Triangle(String shapeName,double newA,double newB,double newC){
             super(shapeName);


             a=newA;
             b=newB;
             c=newC;
                                                                             }



      public double getLength(){
             return a+b+c;
                                }




      public double getArea(){

      double p=(a+b+c)/3;
    
      double n=Math.sqrt(p*(p-a)*(p-b)*(p-c));
 
      return n;        
                               }

     }




public class Main{
       public static void main(String[] args){
              Triangle t1=new Triangle("������",3,4,5);
              System.out.println(";���="+t1.getArea()+"�ܳ�="+t1.getArea());

                                              }
                  }



