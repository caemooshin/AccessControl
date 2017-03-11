/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount.atm;

import bankaccount.bank.BankAccount;

/**
 *
 * @author Y-V-D
 */
public class ATM { private int id;
   
    public ATM(int id) {
        this.id = id;
    }
    
    public void withdraw(BankAccount account, double amount) {
        boolean result = account.withdraw(amount);
        if (result) {
            System.out.println("Successful withdraw on ATM of $" + amount);
        } else {
            System.out.println("Error!");
        }
    }
}
