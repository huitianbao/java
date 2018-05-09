//class Main.java

import java.util.*;
class Main{
       public static void main(String[] args){
             Scanner reader=new Scanner(System.in);

            // Number n;
             int x;
             int y;
             int a,s,m;
             double d;
            
             System.out.println("please input two integers:");
             x=reader.nextInt();
             y=reader.nextInt();
             
             Number n=new Number();
             n.set(x,y);
             
             a=n.add();
             System.out.println(x+"+"+y+"="+a);

             s=n.sub();
             System.out.println(x+"-"+y+"="+s);
             
             if(y!=0){

             d=n.divi2();
             System.out.println(x+"/"+y+"="+d);
                      }
             else
                    {
                        n.divi1();
                     }

             m=n.mult();
             System.out.println(x+"*"+y+"="+m);
                      
     
                                                }
         }
               
             

             