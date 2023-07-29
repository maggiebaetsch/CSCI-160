/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maggiebaetschlab7;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mbaet
 */
public class Lab7 {
    public void item1() 
    {
     int i;
            int total = 0;
            for ( i = 10; i <= 20; i++)
            {
               total += i;
               System.out.println ( total );
            }   
    }
    
    
    public void item2 () 
    {
         Scanner scan = new Scanner (System.in);
            System.out.println();
            Random rand = new Random ();
            int number = rand.nextInt (4);
            String answer = "";
            String end = "no";
            while (answer != end) 
            {
                switch (number) 
                {
                    case 1:
                        System.out.println ("Congrats, you win a car");
                        break;
                    case 2:
                        System.out.println ("Not bad, you got $1000");
                        break;
                    default:
                        System.out.println ("Try again next time");
                }
              System.out.println ("Play again? No to stop");
              answer = scan.next();
              break;
            }
            
            System.out.println ("Game over");
    }
        public void item3() 
            {
                Scanner scan = new Scanner (System.in);
                int l,fact = 1;
                    int num = 5;
                    System.out.println ("Enter a positive number:");
                    num = scan.nextInt();
                    if (num > 0) 
                        {  
                            for (l=1;l<=num;l++)
                            {
                            fact=fact*l;
                            System.out.println("Factorial of " + num + " is: " + fact);
                            }
                        }
                        else if (num < 0)
                        {    
                            System.out.println ("Enter a valid number");
                        }
            }
}
