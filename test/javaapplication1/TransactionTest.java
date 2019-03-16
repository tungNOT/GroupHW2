/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinh
 */
public class TransactionTest {
    
      Account Vinh;
      Transaction Tran;
    
    public TransactionTest() 
    {
       Vinh = new Account("vinhtrang1003", "School", "Hayward", "CA", "5106009094", "Vinh Trang");
       Tran = new Transaction("Null");
       Vinh.newContact("A", "Mr", "5106009095", "A@yahoo.com");
       Vinh.newContact("B", "Ms", "5106009096", "B@yahoo.com");
       Vinh.newContact("C", "Ms", "5106009097", "C@yahoo.com");
       Vinh.addProduct("Computer","0310",599.99);
       Vinh.addProduct("TV","0311",1599.99);
       Vinh.addProduct("DVD","0312",5.99);
       
    }
    
    
    @Test
    public void testCreateTransaction() 
    {
       Tran.CreateTransaction(Vinh.getContact(0), Vinh.getProduct(0), "01", 1);
       Vinh.addTrans(Tran);
       
       Tran = new Transaction("Null");
       Tran.CreateTransaction(Vinh.getContact(1), Vinh.getProduct(1), "02", 1);
       Vinh.addTrans(Tran);
       
       Tran = new Transaction("Null");
       Tran.CreateTransaction(Vinh.getContact(2), Vinh.getProduct(2), "03", 1);
       Vinh.addTrans(Tran);
       
       System.out.println("Test Get First Transaction ");
       String name = "A";
       String name2 = Vinh.getTransaction(0).getCName();
       System.out.println(name + " = " + name2);
       assertEquals(name,name2); 
       
       System.out.println("Test Get Lastest Transaction ");
       name = "C";
       name2 = Vinh.GetLatestTransaction().getCName();
       System.out.println(name + " = " + name2);
       assertEquals(name,name2); 
       
       System.out.println("Test Get Transaction by ID");
       name = "B";
       name2 = Vinh.GetTransactionByID("02").getCName();
       System.out.println(name + " = " + name2);
       assertEquals(name,name2); 
       
       System.out.println("Test Print all Transactions");
       Vinh.listAllTransactions();
       
    }
    
    @After
    public void testProduct() 
    {
    System.out.println("Test Print all Products");
    Vinh.listAllProducts();
    
    System.out.println("Test get Products");
    Products p = Vinh.getProduct(1);
    String PName1 = "TV";
    String PName2 = p.getpname();
    System.out.println(PName1 + " = " + PName2);
    assertEquals(PName1,PName2); 
    
    System.out.println("Test Products ID");
    String ID1 = p.getpid();
    String ID2 = "0311";
    System.out.println(ID1 + " = " + ID2);
    assertEquals(ID1,ID2); 
    
    }
    
    
    
}
