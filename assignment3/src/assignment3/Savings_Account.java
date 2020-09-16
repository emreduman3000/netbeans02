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
class Savings_Account extends Accounts
{
    private double Deposit;
    private double Withdraw;
    

    public Savings_Account(String ID, double Balance,double Overdraft)
    {
        super(ID, Balance, Overdraft);
    }
    public double TheFirstOverdraft=this.getOVERDRAFT();
    public double TheFirstBalance=this.getBALANCE();
    

    
    @Override
    public void Deposit(double Deposited) 
    {
        if( this.getBALANCE() > 0 )
        {
            this.addBALANCE(Deposited);
            System.out.println("\nAmount of $"+Deposited+" deposited to account\n"
                               + "Current account balance after deposit is $"+this.getBALANCE()
                               +"\nCurrent overdraft balance is "+ this.getOVERDRAFT()
                               +"\n-----------------------------------------------------------\n");
        }
        
        
        if(this.getBALANCE() == 0)
        {
            if(Deposited<this.TheFirstOverdraft)
            {
                this.addOVERDRAFT(Deposited);
                System.out.println("\nAmount of $"+Deposited+" deposited to account\n"
                                   + "Current account balance after deposit is $0.0"
                                   +"\nCurrent overdraft balance is "+ this.getOVERDRAFT()
                                   +"\n-----------------------------------------------------------\n");  
            }
            
            if(Deposited>this.TheFirstOverdraft)
            {
                this.addBALANCE(Deposited-TheFirstOverdraft);
                 System.out.println("\nAmount of $"+Deposited+" deposited to account\n"
                                   + "Current account balance after deposit is $"+this.getBALANCE()
                                   +"\nCurrent overdraft balance is $"+TheFirstOverdraft
                                   +"\n-----------------------------------------------------------\n");  
            }
                
        }

    }

    
    
    
    @Override
    public void Withdraw(double Withdrawn) 
    {
        this.subBALANCE(Withdrawn);
        
        if( this.getBALANCE() > 0 )
        {
            System.out.println("\nAmount of $"+Withdrawn+"successfully withdrawn.\n"
                                + "Current account balance after withdraw is $"+this.getBALANCE()
                                +"\nCurrent overdraft balance is "+this.getOVERDRAFT()
                                +"\n----------------------------------------------------------------\n");
        }
        
    
        
        
        if(this.getBALANCE()<0 && getOVERDRAFT()==TheFirstOverdraft)
        {
            double minus=-(this.getBALANCE()) ;
       
            
            if( minus <= TheFirstOverdraft )
            {
                this.subOVERDRAFT(minus);
                
                System.out.println("Overdraft funds required for transaction.\n"
                                 + "Current account balance after withdraw is $0.0"
                                 +"\nCurrent overdraft balance is "+ this.getOVERDRAFT()
                                 +"\n-----------------------------------------------------------\n");
                this.zeroBALANCE(0);

            }
            
            if( minus > TheFirstOverdraft )
            {
                 System.out.println("Insufficient funds to complete transaction.\n"
                                 +"Current account balance after withdraw is $"+TheFirstBalance
                                 +"\nCurrent overdraft balance is "+ this.getOVERDRAFT()
                                 +"\n-----------------------------------------------------------\n");

            }

        }
        
        
        
        if(this.getBALANCE()==0)
        {
            if( this.getOVERDRAFT()==TheFirstOverdraft)
            {
             System.out.println("\nAmount of $"+Withdrawn+"successfully withdrawn.\n"
                                + "Current account balance after withdraw is $0.0"
                                +"\nCurrent overdraft balance is "+this.getOVERDRAFT()
                                +"\n----------------------------------------------------------------\n"); 
            }
            
            
            
            if(this.getOVERDRAFT()!=TheFirstOverdraft)
            {            
                if (Withdrawn<=this.getOVERDRAFT())
                {
                    this.subOVERDRAFT(Withdrawn);
                    System.out.println("\nAmount of $"+Withdrawn+"successfully withdrawn.\n"
                                     + "Current account balance after withdraw is $0.0"
                                     +"\nCurrent overdraft balance is "+ this.getOVERDRAFT()
                                     +"\n-----------------------------------------------------------\n");
                }

                if (Withdrawn>this.getOVERDRAFT())
                {                
                    System.out.println("Insufficient funds to complete transaction.\n"
                                     + "Current account balance after withdraw is $0.0"
                                     +"\nCurrent overdraft balance is "+ this.getOVERDRAFT()
                                     +"\n-----------------------------------------------------------\n");
                }
            }

        }

        
        

    }


    
}
