//class Person
//��ʦ����������Ŀ������е�����   ������һ��Person�࣬��������
//˽�г�Ա����name��score  �� ���ֻ��һ��score ��ô�������С�أ�
//ѧ��������֮

class Person{
       private String name;

       //ѧ��������֮

       double score1;
       double score2;
       double score3;

       void set(String New_name,double New_score1,double New_score2,double New_score3)
       {
           name=New_name;
           score1=New_score1;
           score2=New_score2;
           score3=New_score3;
        }
        
       String getName(){
              return name;
                        }

       double minScore(){
              double min=score1;
               if(score2<min){
                   min=score2;
                              }

               if(score3<min){
                   min=score3;
                              }

                return min;
                          }

       double maxScore(){
               double max=score1;

             if(score2>max){
                 max=score2;
                            }
             if(score3>max){
                 max=score3;
                            }
            return max;
                         }

 
       double totalScore(){
              return score1+score2+score3;
                           }

       double aveScore(){
               return (score1+score2+score3)/3;
                         }


      }

        