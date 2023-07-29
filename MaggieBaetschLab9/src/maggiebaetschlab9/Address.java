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
public class Address {
    
    private String street;
    private String city;
    private String state;
    private String country;
    private int zipcode;
    
    public Address (String street, String city, String state, String country, int zipcode)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }
    
    public boolean isNDAddress () 
    {
      if (state == "ND" || state == "North Dakota")
      {
        return true;
      }
      return false;
    }
    
    
    
    private Address homeAddress;
    
    private static String school = "NDSU";
    
    public Address getHomeAddress() {
        return this.homeAddress;
    }
    
    public void setHomeAddress (Address a)
    {
        this.homeAddress = a;
    }
    
    public String toString () {
        return street + " " + city + " " + state + " " + country + " " + zipcode;
    }
    
    
    
    
   
    

}
