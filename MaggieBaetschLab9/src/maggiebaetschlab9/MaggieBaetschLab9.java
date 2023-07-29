/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maggiebaetschlab9;

/**
 *
 * @author mbaet
 */
public class MaggieBaetschLab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student s1 = new Student ("Madighan", "Elodee", "Baetsch", 'F',19);
        Address a = new Address ("first street","west fargo", "ND", "USA", 58078);
        
        System.out.println (s1.toString() + " " +  a.toString());
        
        
        System.out.println (a.isNDAddress());
        
        testArrayHelper();
    }
    
    public static void testArrayHelper () {
        
        double [] a1 = {1,2,3,4,5};
        double [] a2 = {2};
        double [] a3 = {};
       
        
       System.out.println (ArrayHelper.calculateTotal(a1));
       System.out.println (ArrayHelper.calculateAverage(a1));
       ArrayHelper.getMax(a1);
        
       System.out.println (ArrayHelper.calculateTotal(a2));
       System.out.println (ArrayHelper.calculateAverage(a2));
       ArrayHelper.getMax(a2);
        
       System.out.println (ArrayHelper.calculateTotal(a3));
       System.out.println (ArrayHelper.calculateAverage(a3));
       ArrayHelper.getMax(a3);
    }
    
     public static void testGradeCalculator () {
        GradeCalculator g = new GradeCalculator();
        double assignments[] = {94,93,29};
        double quizzes[] = {67,46,98};
        double exam1[] = {100};
        double exam2[] = {87};
        double finalExam[] = {78};
        
        g.getFinalScore();
        g.getLetterGrades();
        g.printReport();
        }
    
}
