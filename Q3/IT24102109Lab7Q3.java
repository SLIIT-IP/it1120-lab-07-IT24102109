import java.util.Scanner;

public class IT24102109Lab7Q3{
      public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          int customer = 1;
          int bill;
          char payment_method;
          double discount, total_bill;

          while(customer <= 5){

              System.out.println("Customer " + customer);

              System.out.print("Enter total bill amount: ");
              bill = sc.nextInt();

              System.out.print("Enter mode of payment (C for cash, O for other): ");
              payment_method = sc.next().toUpperCase().charAt(0);


              switch(payment_method){

                    case('O'):       
                                  System.out.println("No discount applicable");
                                  System.out.println("Amount to be paid: " + (double)bill);
                                  break;

                    case('C'):

                                  discount = 5*( (double)bill/100 ); 
                                  System.out.println("Discount is : " + discount);

                                  total_bill = bill - discount;
                                  System.out.println("Amount to be paid: " + total_bill);
                                  break;
                     
                    default:  
                                  System.out.println("Payment Mode is Not Valid");


              }


              customer++ ;

              System.out.print("\n");

          }


      }

}