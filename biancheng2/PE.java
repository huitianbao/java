//class PE


import java.util.*;
class Person{
      protected String Name;
      protected int Age;
      
      public Person(String newName,int newAge){
             Name=newName;
             Age=newAge;
             System.out.println("�в�����Person()���캯��������");

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
      System.out.println("Employee ���캯��������");

                                                              }


    
      void printEmployee(){
           System.out.println("����"+this.Name+"����"+this.getAge()+"���"+this.Employee_no);


                                                              }
             }




public class PE{
       public static void main(String[] args){
              Scanner reader=new Scanner(System.in);


              System.out.println("���������������䣬���");
              String name;
              int age,num;
              name=reader.next();
              age=reader.nextInt();
              num=nextInt();
              

             Employee s1=new Employee("hui",20,123456);

             s1.printEmployee();


  

                                                }



               }
