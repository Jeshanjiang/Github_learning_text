// Jiaxiong Jiang

// September 11 2024

// Lab 6 Print a service charge

// The program should calculate and print a service charge for cashing a check.

import java.util.Scanner;

public class ChargeCalculator 
{
   public static void main( String[] args )
   {
      double checkValue;
      double serviceCharge;
      
      
      System.out.println("What is the value of the check?");
      Scanner input = new Scanner(System.in);
      checkValue = input.nextDouble();
      
      if(checkValue <= 10)
      { 
         serviceCharge = 1.0;
      }
      else if(checkValue > 10 && checkValue <= 100)
      {
         serviceCharge = checkValue * 0.1;
      }
      else if(checkValue > 100 && checkValue <= 1000)
      {
         serviceCharge = checkValue * 0.05 + 5;
      }
      else
      {
         serviceCharge = checkValue * 0.01 + 40;
      }
      
      double amountReturned = checkValue - serviceCharge;
      
      System.out.println("Receipt:");
      System.out.println("  $" + checkValue + "(amount of check)");
      System.out.println("  $" + serviceCharge + "(service charge)");
      System.out.println("  $" + amountReturned + "(amount returned to you)");
      
      
      
   }
}
      
