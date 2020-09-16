/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author emreduman
 */
public  abstract class Accounts 
{
    private String Customer_ID;
    private double Balance;
    private double Overdraft_Amount;
    
    public String getID() {return this.Customer_ID; }
    
    public double addBALANCE(double add) {return this.Balance+=add; }
    public double subBALANCE(double sub) {return this.Balance-=sub; }
    public void zeroBALANCE(double zero) { this.Balance=zero; }
    public double getBALANCE() {return this.Balance; }

    public double addOVERDRAFT(double add) {return this.Overdraft_Amount+=add; }
    public double subOVERDRAFT(double sub) {return this.Overdraft_Amount-=sub; }
    public double getOVERDRAFT() {return this.Overdraft_Amount; }
      
    public Accounts(String ID, double Balance,double Overdraft)
    {
        this.Customer_ID = ID;
        this.Balance =  Balance;
        this.Overdraft_Amount=Overdraft;
    }
    
    public abstract void Deposit(double Deposited);
    public abstract void Withdraw(double Withdrawn);

    
}
