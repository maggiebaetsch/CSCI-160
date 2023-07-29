/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maggiebaetschlab6;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author mbaet
 */
public class MaggieBaetschLab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        
        
    int sum = 0;
    int i =7;
    while (i % 10 !=0) {
        sum += i;
        i++;
    }
    System.out.println("sum is " + sum + ", i is " + i);
    // sum is 24, i is 10
    
    //the program will not work because there is no counter to terminate the loop
    int a = 0;
    while (a <5) {
        System.out.println ("Nice date");
        a++;
    }
    //original will not work, it will print 4 times because zero counts as int
    int b = 3;
    while (b>0) {
        System.out.println("Hello");
        b--;
    }
    System.out.println ("Start checkout process");
    double total = 0;
    int count = 0;
    double price = 0;
    DecimalFormat f = new DecimalFormat ("$0.00");
    Scanner scan = new Scanner (System.in);
    
    
    System.out.println ("Enter your item or d to stop: ");
    String item = scan.next();
    String receipt = "";
    while (!item.equals ("d")) {
        System.out.println("Enter the price for item: ");
        price = scan.nextDouble();
        total += price;
        receipt += item;
        receipt += ("     " + f.format(price) + "\n");
        count++;   
        System.out.println("Enter the name of your item: ");
        item = scan.next();
    }
    
        System.out.println ("***Your receipt***" + 
            "\nYou purchased " + count + " items."
             + "\nYour total price is " + f.format(total));
        System.out.println (receipt);
    
     //**********FINISH*************   
     
     System.out.println();
    System.out.println("Enter a number here, or -1 to stop : ");
    int num = 0;
    while (num != -1) {
    num = scan.nextInt(); 
    //****FINISH****
    
    
    System.out.println ("Enter exam scores, or enter -1 to stop: ");
    int score = 0, fullScore = 0,aScore = 0,passScore = 0,totalScore = 0, totalPoints = 0;
    while (score != -1) {
        score = scan.nextInt();
        totalScore++;
        totalPoints += score;
        if (score >= 60 && score < 90) {
            passScore++;
        }
        else if (score == 100) {
            fullScore++;
        }
        else if (score >=90 && score != 100) {
            aScore++;
        }
        else if (score >= 60 && score < 90) {
            passScore++;
        }
    }
        System.out.println ("The total number of scores: " + totalScore);
        System.out.println ("The total number of full scores: " + fullScore);
        System.out.println ("The total number of A's: " +  aScore);
        System.out.println ("The total number of scores between 60 and 90: " + passScore);
        System.out.println ("The class average is " + (totalPoints/totalScore));
    
        
        
    
   
    }
    
}}
