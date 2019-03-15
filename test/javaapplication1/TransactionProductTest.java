/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Calendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vinh
 */
public class TransactionProductTest {
    
    Account Vinh;
    Transaction Tran;
    
    
    @Test
    public void testCreateTransaction() 
    {
       Vinh = new Account("vinhtrang1003", "School", "Hayward", "CA", "5106009094", "Vinh Trang");
       Tran = new Transaction("Null");
       
       Vinh.newContact("A", "Mr", "5106009095", "A@yahoo.com");
       Vinh.newContact("B", "Ms", "5106009096", "B@yahoo.com");
       Vinh.newContact("C", "Ms", "5106009097", "C@yahoo.com");
       
       Vinh.addProduct("Computer","0310",599.99);
       Vinh.addProduct("TV","0311",1599.99);
       Vinh.addProduct("DVD","0312",5.99);
       
       Tran.CreateTransaction(Vinh.getContact(0), Vinh.getProduct(0), "123", 1);
       Vinh.addTrans(Tran);
       
       String name = "A";
       String name2 = Vinh.GetLatestTransaction().getCName();
       
       assertEquals(name,name2);
       
        
    }
    
}
