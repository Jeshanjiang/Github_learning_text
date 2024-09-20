// Jiaxiong Jiang
// August 28
// Lab 4 SandwichShop
// This program asks if people want a ham sandwich.

import javax.swing.JOptionPane;
public class SandwichShop
{
   public static void main(String [] args)
   {
      int answer = JOptionPane.showConfirmDialog(
      null,"Do you want a ham Sanwich?","Sandwich Shop",
      JOptionPane.YES_NO_OPTION);
      
      if(answer == JOptionPane.YES_OPTION)
      {
         JOptionPane.showMessageDialog(null, "10 dollars, Please.");
      }
      else
      {
         JOptionPane.showMessageDialog(null, "No worries, Have a good day!");
      }
      System.exit(0);
    }
}   