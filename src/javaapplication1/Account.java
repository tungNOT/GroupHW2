/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC200
 */
public class Account {
    private String accountName;
    private String industry;
    private String billingCity;
    private String billingState;
    private String phone;
    private String accountOwner;
    private int numOfEmployee;
    private List<Contact> contactLst;
    
    public Account(String a_accName, String a_indus, String a_billCity, String a_billState, String a_phone, String a_owner) {
        accountName = a_accName;
        industry = a_indus;
        billingCity = a_billCity;
        billingState = a_billState;
        phone = a_phone;
        accountOwner = a_owner;
        contactLst = new ArrayList<>();
    }
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(int numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }

    public List<Contact> getContactLst() {
        return contactLst;
    }
    
    public void newContact (String a_name, String a_title, String a_phone, String a_email){
        Contact newContact = new Contact(a_name, a_title, a_phone, a_email);
        contactLst.add(newContact);
    }
    
    public void listAllContacts(){
        int num = 0;
        for (Contact i : contactLst){
            System.out.println(num+") " + i.getName() + ", " + i.getEmail() + ", " + i.getPhone() + ", " + i.getTitle());
        }
    }
    
}
