/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maggiebaetschlab5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mbaet
 */
public class MaggieBaetschLab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 15;
        boolean booNum;
        if (num == 15) {
            System.out.println ("Num is equal to 40.");
        }
        if  (num<18 && num>65){
        System.out.println ("Num is less than 18 or greater than 65.");
        }
        if (13 <= num && num < 18){
            System.out.println ("Num is between 13 and 18.");
        }
        boolean isGreaterThan100;
        if (num >= 100){
            isGreaterThan100 = true;
        }
        else {
            isGreaterThan100 = false;
        }
        System.out.println (isGreaterThan100);
        
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println ("Please enter the temperature: ");
        int temp = scan.nextInt();
            if (temp>= 80) {
               System.out.println ("The season is most likely summer.");
                }
            else if (temp >= 60 && temp < 80) {
                System.out.println ("The season is most likely spring.");
                }
            else if (temp >= 40 && temp < 60) {
                System.out.println ("The season is most likely fall.");
                }
            else if (temp < 40) {
                System.out.println ("The season is most likely winter.");
                }
            else if (temp < -20 && temp > 120) {
                System.out.println ("You have entered an invalid temperature. Try again");
            }
            
            
        Random rand = new Random ();
        int number = rand.nextInt (11);
        System.out.println ("Guess the random number from 1-10!");
        int guess = scan.nextInt();
        
            if (guess > 10 && guess < 1) {
                System.out.println ("Invalid number");
            }
            else if (guess == number) {
                System.out.println ("You were correct!" + "Number was: " + number);
            }
            else if ( guess <= (number - 3)) {
                System.out.println ("You missed by a mile, number was " + number);
            }
            else if ( guess >= (number + 3)) {
                System.out.println ("You missed by a mile number was " + number +
                        "Better luck next time!");
            }
            else if (guess != number) {
                System.out.println ("You were close, number was " + number +
                        " Better luck next time!");
            }
            
            
        System.out.println ("Enter your email: ");
        String email = scan.next ();
            if (email.charAt (1) == '@') {
                System.out.println ("Invalid email");
            }
                
                
                
        int num1 =7;
        int num2;
        if (num1 % 2 != 0); {
        num2 = num1 + 1;
        System.out.println ("num2 is " + num2);
            }
       //if entered 7, output is 8; if entered 5, output is 6
       
       System.out.println ("Enter a number: ");
       String fact = scan.next ();
       String funFact = "1";
       switch (funFact) {
           case "1":
               System.out.println ("The hottest month is July");
               break;
           case "2":
               System.out.println ("The coldest month is January");
               break;
           case "3": 
               System.out.println ("The wettest month is June");
               break;
           case "4": 
               System.out.println ("The windiest month is April");
               break;
           default : 
               System.out.println ("Unknown");
       
        
    
            
        
            
        
            
        
            
            
            
                
                
                
                
                
                }
    }
}
