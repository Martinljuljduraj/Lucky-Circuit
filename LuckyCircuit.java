// Martin Ljuljduraj  
// Lucky Circuit - Casino slot machine with loop

import java.util.Scanner;
import java.util.Random;

public class LuckyCircuit
{
   public static void main(String[] args)
   {
      // declare var
      int n1, n2, n3; // random numbers
      int games = 0, losses = 0, wins = 0, bumpers = 0;// stats
      String answer = "yes";// user choice of yes or no
      
      // instantiate objects
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      
      // loop
      while(answer.equals("yes"))
      {
         // start loop
         System.out.println("Let's play");
         games++;// increment by 1
         // generate 3 random numbers
         n1 = rand.nextInt(9) + 1;
         n2 = rand.nextInt(9) + 1;
         n3 = rand.nextInt(9) + 1;
         System.out.println("Numbers are " + n1 + " " + n2 + " " + n3);
         
         // compare
         if(n1 == n2 && n2 == n3)// all 3 numbers are equal
         {
            if(n1 == 7)// all 3 numbers are 7
            {
               bumpers++;
               System.out.println("YOU WIN THE BUMPER JACKPOT!!");
            }
            else // the numbers are equal but not 7
            {
               wins++;
               System.out.println("You win $1000");
            }
         }
         else // the numbers are not the same
         {
            losses++;
            System.out.println("You lose.");
         }
         System.out.println("Do you want to play again? Type yes or no");
         answer = scan.nextLine();
      }// end while
      
      // stats
      System.out.println("Number of games played = " + games);
      System.out.println("Number of wins = " + wins);
      System.out.println("Number of bumper jackpots = " + bumpers);
      System.out.println("Number of losses = " + losses);
   }// end main
}// end class
         
      