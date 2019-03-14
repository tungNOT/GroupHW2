/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Vinh
 */
public class Products 
{
    private String productName;
    private int productID;
    private double productPrice;
    
    
    public Products (String pname, int pid, double pprice)
    {
        productName = pname;
        productID = pid;
        productPrice = pprice;
    }
    
    public String getpname()
    {
        return productName;
    }
    
    public int getpid()
    {
        return productID;
    }
      
    public double getpprice()
    {
        return productPrice;
    }
        
    public void setpprice( double p)
    {
        productPrice = p;
    }
    
     public void setID( int id)
    {
        productID = id;
    }
    
    
    
    
}
