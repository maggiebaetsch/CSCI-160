/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maggiebaetschlab8;

/**
 *
 * @author mbaet
 */
public class MaggieBaetschLab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student s1 = new Student ("Madighan", "Elodee", "Baetsch", 'f', 1);
        Student s2 = new Student ("Makenzy", "Morrison", "Goos", 'f',1);
        Student s3 = new Student ("Thomas","Gregory","Nathan",'m',1);
        
        System.out.println (s1.toString() + " " + s2.toString () + " " + s3.toString());
        System.out.println (s1.getLastName());
        s1.setLastName ("Goos");
        System.out.println (s1.getLastName());
        
        /* s1.setLastName (null);
        System.out.println (s1.getLastName()); */
        
        s1.setGender ('m');
        System.out.println (s1.getGender());
        
        s1.setGender ('s');
        System.out.println (s1.getGender());
        
        System.out.println (s1.getFullNameOne());
        System.out.println (s1.getFullNameTwo());
        System.out.println (s1.getFullNameThree());
        
        // The values are the same because they operate seperately when called from getter
        
        boolean result = s1.equals (s2);
        System.out.println (result);
        
        /*it would not be okay to change them to static method 
            because the class has objects in it
        */
    }
    
}
