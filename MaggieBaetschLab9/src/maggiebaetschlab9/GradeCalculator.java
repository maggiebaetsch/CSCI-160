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
public class GradeCalculator {
    
    enum LetterGrades {A, B, C, D, F};
        
    public final double assignmentWeight = 0.5;
    public final double quizWeight = 0.15;
    public final double exam1Weight = 0.1;
    public final double exam2Weight = 0.1;
    public final double finalExamWeight = 0.15;
    
    private double[] assignments;
    private double[] quizzes;
    private double exam1;
    private double exam2;
    private double finalExam;
    
    public void setAssignments (double[] scores ) {
        this.assignments = scores;
    }
    
    public void setQuiz (double [] scores) {
        this.quizzes = scores;
    }
    
    public void setExam1 (double exam1) {
        this.exam1 = exam1;
    }
    
    public void setExam2 (double exam2) {
        this.exam2 = exam2;
    }
    
    public void setFinalExam (double finalExam) {
        this.finalExam = finalExam;
    }
    
    public double getFinalScore () {
       double q = ArrayHelper.calculateAverage(quizzes);
       double a = ArrayHelper.calculateAverage(assignments);
       
       return ((a * assignmentWeight) +  ( q * quizWeight) + (exam1 * exam1Weight) 
               + (exam2 * exam2Weight) + (finalExam * finalExamWeight));   
    }
    
    public LetterGrades getLetterGrades() {
        if (getFinalScore() >= 90) {
            return LetterGrades.A;
        }
        else if (getFinalScore() >= 80)  {
            return LetterGrades.B;
        }
        else if (getFinalScore() >= 70) {
            return LetterGrades.C;
        }
        else if (getFinalScore() >= 60) {
            return LetterGrades.D;
        }
        else {
            return LetterGrades.F;
        }
    }
    
    public void printReport () {
        System.out.println ("****YOUR REPORT****");
        System.out.println (assignments);
        System.out.println (quizzes);
        System.out.println (exam1);
        System.out.println (exam2);
        System.out.println (finalExam);
        System.out.println ("Your final score is " + getFinalScore());
        System.out.println ("Letter grade is " + getLetterGrades());
    }
 }

