// Jiaxiong Jiang

// September 20 2024

// Lab 5 the score entered

// This program  allows a user to enter any number of student test scores until the user enters a score that is less than 0

import java.util.Scanner;

public class ScoreEntered 
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Please enter a positive score, enter a negertive number to end");
      
      double score = input.nextDouble();
      double sum = 0;
      int count = 0;
      double lowestScore = 100000;
      double highestScore = 0;
      
      while(score >= 0)
      {
         count++;
         
         if (score < lowestScore )
         {
            lowestScore = score;
         }
         else if(score > highestScore)
         {
            highestScore = score;
         }
         
         sum += score;
         System.out.println("Please enter a positive score, enter a negertive number to end");
         score = input.nextDouble();
      }
     
      System.out.println("the number of scores entered " + count);
      System.out.println("the highest score " + highestScore);
      System.out.println("the lowest score " + lowestScore);
      System.out.println("the arithmetic average " + sum/count );

   }
}
      
      