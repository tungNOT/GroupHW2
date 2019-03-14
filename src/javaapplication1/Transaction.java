/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Vinh
 */
public class Transaction 
{
    private String CustomerName;
    private String ProductName;
    
    private int ProductID;
    private int Quality;
    //this is vinh branch
    private int TransactionID;
    Calendar DatePurchased;
    
    public Transaction(Contact CContact, Products P, int TID, int Q)
    {
        Calendar today = new GregorianCalendar();
        int thisYear = today.get(Calendar.YEAR),
            thisMonth = today.get(Calendar.MONTH),
            thisDay = today.get(Calendar.DAY_OF_MONTH);
        
        CustomerName = CContact.getName();
        ProductName = P.getpname();
        ProductID = P.getpid();
        
        TransactionID = TID;
        Quality = Q;
        
        DatePurchased = today;
    }
    
    
    
    
    
}
