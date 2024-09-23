import java.util.Scanner;

public class IT24102109Lab7Q1B{
        public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          
          double average;
          int count;
          int sub_sum = 0;
          String[] mark_array;
          String  sub_mark = "";

          
        
          

          for(count=1 ; count <= 3 ; count++){

               System.out.println("Student " + count);

               
               System.out.print("Enter Subject Mark : ");
               sub_mark = sc.nextLine();

               mark_array = sub_mark.split(" ");

               int sub1 = Integer.parseInt(mark_array[0]);
               int sub2 = Integer.parseInt(mark_array[1]);
               int sub3 = Integer.parseInt(mark_array[2]);
               int sub4 = Integer.parseInt(mark_array[3]);

             
               sub_sum = sub1 + sub2 + sub3 + sub4 ;

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

          
               System.out.println("Average is : " + average);
               System.out.print("Overall Grade is : " + grade);
               System.out.println("\n");



          }

       
         
         

        }




}