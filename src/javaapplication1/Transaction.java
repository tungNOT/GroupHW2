/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
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
    
    private int TransactionID;
    Calendar DatePurchased;
    
    private ArrayList<Transaction> TransactionList;

    private Transaction(int id) 
    {
        TransactionID = id;
    }
    
    public void CreateTransaction(Contact CContact, Products P, int TID, int Q)
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
    
    public void addTrans(Transaction T)
    {
        TransactionList.add(T);
    }
    
    public Transaction GetLatestTransaction()
    {
        Transaction LastTrans;
        if (! TransactionList.isEmpty())
            LastTrans = TransactionList.get(TransactionList.size() - 1);
        else
        {
            LastTrans = new Transaction(0);
            System.out.println("None transaction found");
        }
        
        return LastTrans;
        
    }
    
    public Transaction GetTransactionByID(int TID)
    {
        Transaction None;
        None = new Transaction(0);
        
        for (int i = 0; i < TransactionList.size() ; i++) 
        {
            Transaction T;
            T = TransactionList.get(i);
            if (T.TransactionID == TID)
            {
                return T;
            }
        }
        
        return None;
        
    }
    
    
    
    
    
}
