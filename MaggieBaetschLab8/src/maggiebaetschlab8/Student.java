/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maggiebaetschlab8;
import java.util.Scanner;
/**
 *
 * @author mbaet
 */
public class Student {

    
    private String firstName;
    private String middleName;
    private String lastName;
    private char gender;
    private int studentID;
    private static int idCounter = 0;
    
        public Student (String fName, String mName, String lName, char g, int studentID)
        {
            firstName = fName;
            middleName = mName;
            lastName = lName;
            gender = g;
            idCounter++;
            this.studentID = idCounter;
        }
        public String getFirstName()
        {
            return firstName;
        }
        public String getMiddleName()
        {
            return middleName;
        }
       public String getLastName ()
       {
            return lastName;
       } 
       public char getGender()
       {
           return gender;
       }
       public int getStudentID()
       {
           return studentID;
       }
       public void setFirstName (String fName) 
       {
            if (fName.length()>0 && fName != null ) 
            {
                firstName = fName;  
            }
       }
        public void setMiddleName (String mName)
        {
            if (mName.length()>0 && mName!=null)
            {
                middleName = mName;
            }
        }
        public void setLastName (String lName)
        {
           if (lName.length()>0 && lName != null)
           {
                lastName = lName;
           }
        }
        public void setGender (char g) 
       {
          g = Character.toUpperCase(g);
            if (g == 'M' || g == 'F' || g == 'U' ) 
            {
              gender = g;  
            }
       }   
       
        
       Scanner scan = new Scanner(System.in);
       
        int option = 1;
        
       
        public String getFullNameOne ()
        {
            return firstName + " " + middleName + " " + lastName + " ID number: " + studentID;
        }
        
         public String getFullNameTwo ()
        {
            return lastName + ", " + firstName + " ID number: " + studentID;
        }
        
         public String getFullNameThree ()
        {
            return firstName + " " + middleName.charAt(0) + " " + lastName + " ID number: " + studentID;
        }
         
        
        
        public void declareOption ()    
        {
            System.out.println ("Enter an option 1, 2 or 3");  
            option = scan.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println (firstName + " " + middleName + " " + lastName);
                    break;
                case 2:
                    System.out.println (lastName + ", " + firstName);
                    break;
                case 3:
                    System.out.println (firstName + " " + middleName.charAt(0) + " " + lastName);
                    break;
                default:
                    System.out.println ("Enter a valid option");
                    break;
            }
        }
        
        public String toString()
        {
            return this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName()
                    + " ID Number: " + studentID;
        }
         
        public static int getIDCounter ()
        {
            return idCounter;
        }
        
        
        
    
        
        
}
        
