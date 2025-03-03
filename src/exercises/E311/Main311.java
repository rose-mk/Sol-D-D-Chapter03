/*
(Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw
that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
the Account’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw.
*/
package exercises.E311;

import java.util.Scanner;

public class Main311 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Account account01 = new Account ("Josh Brown", 96.3, 12345678);
                
        System.out.println("--Welcome to Mbank!--");
        
        System.out.println("Enter your ID: ");
        int id = input.nextInt();
        
        Account account = new Account(id);
        
        if(id == account01.getID()){
            System.out.println(account01.personInfo(id));
        } else{
            System.out.println("ID not found");
            return;
        }
        
        int op=0;
        System.out.println("--MENU--");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Exit");
        System.out.println("Choose one option for operation: ");
        op = input.nextInt();
        
        switch(op){
            case 1: 
                System.out.println("Enter amount to deposit: ");
                double depositAmount = input.nextDouble();
                System.out.println("Adding " + depositAmount + "$ to your account...");
                account01.deposit(depositAmount);
                System.out.println("Your new balance: " + account01.getBalance() + " $");
                System.out.println("Thank you for using MBank!");
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                double withdrawAmount = input.nextDouble();
                System.out.println("Withdawing " + withdrawAmount + "$ from your account...");
                account01.withdraw(withdrawAmount);
                System.out.println("Your new balance: " + account01.getBalance()+ " $");
                System.out.println("Thank you for using MBank!");
                break;
            default:
                System.out.println("Not valid");
        }

    }
    
}
