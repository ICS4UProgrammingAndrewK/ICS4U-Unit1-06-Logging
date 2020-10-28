/**
*
* class LoggingCompany
*
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-18-09
*/

import java.util.Scanner;

public class LoggingCompany 
{
   public static void main(String [] args)
   {
     
     Scanner userInput = new Scanner(System.in);
     
      // declare local varibles
      double logs;
      double useLength;
      
      // The length of the logs
      System.out.println (" Enter the lengths of the logs 0.25 m, 0.5 m or 1m ");
      
      // Know Length
      useLength = userInput.nextDouble();
      
      // apply formula
      logs = (1100 / (20 * (useLength)));
      
      // output console
      System.out.println(" The Total Maple Logs in truck is: " + logs
      );
   }
}
