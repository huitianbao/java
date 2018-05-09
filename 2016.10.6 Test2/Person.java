//class Person
//老师，你的这个题目表达上有点问题   “定义一个Person类，包含两个
//私有成员变量name，score  ” 如果只有一个score 怎么有最大，最小呢？
//学生姑妄言之

class Person{
       private String name;

       //学生估妄改之

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

        