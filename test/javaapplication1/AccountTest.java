/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tung
 */
public class AccountTest {
    Account Tung;
    Account Nguyen;
    
    Contact cont1;
    Contact cont2;
    
    public AccountTest() {
        Tung = new Account("Tung", "CSU", "hayward", "ca", "012345678", "TungNguyen");
        Nguyen = new Account("Nguyen", "CSU", "hayward", "ca", "876543210", "NguyenTung");
        
        
        Tung.newContact("ABC", "Mr", "012345679", "ABC@gmail.com");
        Nguyen.newContact("ABC", "Mr", "012345679", "ABC@gmail.com");
        
    }
    

    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void AccountTest() 
     {
         String ContactName = Nguyen.getContact(0).getName();
         String ContactNameT = Tung.getContact(0).getName();
         assertEquals(ContactName,ContactNameT);
         System.out.println(ContactName + " = " + ContactNameT);
         
         String ContactE = Nguyen.getContact(0).getEmail();
         String ContactET = Tung.getContact(0).getEmail();
         assertEquals(ContactE,ContactET);
         System.out.println(ContactE + " = " + ContactET);
         
         
         
     }
}
