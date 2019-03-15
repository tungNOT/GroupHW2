/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC200
 */
public class AccountController {
    private List<Account> accounts;
    private List<AccountMenuInterface> menuOptions;
    public AccountController() {
       accounts = new ArrayList<>();
       menuOptions = new ArrayList<>();
       menuOptions.add(new NewAccountMenu());
       menuOptions.add(new SelectAccountMenu());
       menuOptions.add(new ListAllAccount());
       
    }
    
    public void execute(){
        Scanner scannerOject = new Scanner(System.in);  // Create a Scanner object
        int num = 0;
        System.out.println("Choose an option");
        for (AccountMenuInterface i: menuOptions){
            System.out.println( num + ". " + i );
            num++;
        }
        int option = scannerOject.nextInt();
        menuOptions.get(option).execute(accounts);
        
    }
}
