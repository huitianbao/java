//class PE


import java.util.*;
class Person{
      protected String Name;
      protected int Age;
      
      public Person(String newName,int newAge){
             Name=newName;
             Age=newAge;
             System.out.println("有参数的Person()构造函数被调用");

                                               }

 
      public int getAge(){
             return Age;
                          }


           }



class Employee{
      protected int Employee_no;
      Employee(String newName,int newAge,int newEmployee_no){


      super(newName,newAge);

      Employee=newEmployee;
      System.out.println("Employee 构造函数被调用");

                                                              }


    
      void printEmployee(){
           System.out.println("姓名"+this.Name+"年龄"+this.getAge()+"编号"+this.Employee_no);


                                                              }
             }




public class PE{
       public static void main(String[] args){
              Scanner reader=new Scanner(System.in);


              System.out.println("请输入姓名，年龄，编号");
              String name;
              int age,num;
              name=reader.next();
              age=reader.nextInt();
              num=nextInt();
              

             Employee s1=new Employee("hui",20,123456);

             s1.printEmployee();


  

                                                }



               }
