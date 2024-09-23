import java.util.Scanner;

public class IT24102109Lab7Q1A{
        public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          
          double average;
          int sub_mark;
          int sub_num, sub_sum = 0;

          System.out.println("Enter marks for four subjects:");

          
          for(sub_num = 1; sub_num <= 4; sub_num++){

                 System.out.print("Enter Subject Mark " + sub_num + ": ");
                 sub_mark = sc.nextInt();

                 sub_sum = sub_sum + sub_mark;
                              
          }


          average = (double)sub_sum / 4;

          String grade = "";


          if(average <= 100 && average >= 75){
                grade = "Distinction";
          }
          else if(average <= 74 && average >= 50){
                grade = "Credit";
          }
          else if(average <= 49 && average >= 0){
                grade = "Fail";
          }

          
          System.out.println("\nAverage is : " + average);
          System.out.print("Overall Grade is : " + grade);


        }




}