/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC200
 */
public class SelectAccountMenu implements AccountMenuInterface{
    private Account currentSelectedAcc;

    @Override
    public void execute(List<Account> acc) {
        int numOfAcc = acc.size();
        if (numOfAcc == 0){
            System.out.println("No Account is found");
            return;
        }
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("Select one of the Account below");
        for (Account i: acc){
            System.out.println(num+". " + i.getAccountName());
            num++;
        }
        int option = scan.nextInt();
        currentSelectedAcc = acc.get(option);
        System.out.println("Select one of the Account options");
        System.out.println("0. create new contact");
        System.out.println("1. list all contacts");
        System.out.println("2. go back to main menu");
        option = scan.nextInt();
        if (option == 1){
            currentSelectedAcc.listAllContacts();
        }
        else if (option == 0) {
            //String name, String title, int phone, String email
            System.out.println("Enter Name: ");
            String name = scan.nextLine();
            System.out.println("Enter Title: ");
            String title = scan.nextLine();
            System.out.println("Enter Phone: ");
            String phone = scan.nextLine();
            System.out.println("Enter Email: ");
            String email = scan.nextLine();
            currentSelectedAcc.newContact(name , title, phone, email);
        }
        else {
            return;
        }
    }
    public String toString(){
        return "Select An Account";
    }
}
