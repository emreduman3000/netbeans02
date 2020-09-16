/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author emreduman
 */
public class TestProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter a customer ID for the savings account: ");
        String ID = scan.nextLine();
        System.out.print("Please enter a starting balance for the savings account: ");
        int BALANCE = scan.nextInt();
        System.out.print("Please enter the overdraft limit for the savings account:  ");
        int OVERDRAFT = scan.nextInt();
        System.out.print("-----------------------------------------------------------\n");

        Savings_Account object =new Savings_Account(ID,BALANCE,OVERDRAFT);
        
        int a=1;
        while(a==1)
        {
            
            System.out.println("1. Deposit Amount to Savings Account\n" +
                               "2. Withdraw Amount from Savings Account\n" +
                               "3. Exit");
            System.out.print("-----------------------------------------------------------\n");
            System.out.print("Choose a menu option for the savings account:"); 
            int Option=scan.nextInt();
            
            switch(Option)
            {          
                case 1:
                    System.out.print("Please enter an amount to deposit to your savings account:");
                    object.Deposit(scan.nextInt());  
                    break;
                case 2:
                    System.out.print("Please enter an amount to withdraw from your savings account:");
                    int w=scan.nextInt();
                    object.Withdraw(w);  
                    
                
                    break;
                    
                case 3:
                    a=0;
                    break;
                
                default:System.out.println("PLEASE MAKE OPTION BETWEEN 1-3");
            }//end of switch Statement
            
            
        }
                
        
    }
    
}
