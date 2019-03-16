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
    
    public AccountTest() {
        Account acc1 = new Account("aaa", "aaa", "aaa", "aaa", "aaa", "aaa");
        Contact cont1 = new Contact("a","a","a","a");
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
     public void AccountTest() {
         acc1.newContact("a","a","a","a");
         List<Contact> contList1 = acc1.getContactLst();
         assertEquals(contList1.get(0),cont1);
     }
}
