/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maggiebaetschlab9;
import java.util.Arrays;
/**
 *
 * @author mbaet
 */
public class ArrayHelper {
   
    
    
    public static void printArray (double [] a )
    {
      System.out.println ("*" + Arrays.toString (a) + "*");  
    }
    
     
    public static double calculateTotal (double[] a)        
    {
        double totalPoints = 0;
        for (int i = 0; i < a.length; i++) {
            totalPoints += a [i];
        }
    return totalPoints;     
    }
    
    public static double calculateAverage(double[] a) {
        double total = 0.0;
        for (double elements : a) {
            if (elements > 0) {
                total += elements;
            }
        }
        return (total / a.length);
    }
    
    public static double getMax (double [] a) {
        
        try {
            double largestIdx = a[0];
            
            for (int idx = 0;idx < a.length; idx++) {
                if (a[idx] > largestIdx){
                    largestIdx = a[idx];
                }
                else if (a[idx] == a.length) {
                    return 0;
                }
            }
            return largestIdx;
        }
        catch (Exception e) {
            return 0;
        }
}
}
        
     
    



