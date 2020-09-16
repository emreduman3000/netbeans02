/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author emreduman
 */
public class Commission {
    
    private String FirstName;
    private String LastName;
    private int SIN;
    private double GrossSales;
    private double CommissionRate; 
    
    public Commission(String fm,String lm,int ssn,double gs,double cr)
    {
        this.FirstName=fm;
        this.LastName=lm;
        this.SIN=ssn;
        this.GrossSales=gs;
        this.CommissionRate=cr;
    }

    public double earning()
    {
        return ( this.GrossSales*this.CommissionRate );
    }
    
    public String getFirstName(){return this.FirstName;}
    public String getLastName(){return this.LastName;}
    public int getSIN(){return this.SIN;}
    public double getGrossSales(){return this.GrossSales;}
    public double getCommissionRate(){return this.CommissionRate;}
    
}

class BaseCommission extends Commission
{
    private int BasicSalary;
    public BaseCommission(String fm, String lm, int ssn, double gs, double cr,int bs)
    {
        super(fm, lm, ssn, gs, cr);
        this.BasicSalary=bs;
    }
    
    public double countsalary()
    {
        super.earning();
        return ( this.BasicSalary+this.earning() );
    }
  
    @Override
    public String toString()
    {
        return "Employee first name:"+this.getFirstName()+"\nEmployee Last Name:"+this.getLastName()
                +"\nEmployee SIN Number:"+this.getSIN()+"\nEmployee Gross Sale:"+this.getGrossSales()
                +"\nEmployee Commission Rate:"+this.getCommissionRate()+"\nEmployee Basic Salary:"+this.BasicSalary
                +"\nEmployee Earning:"+this.earning()+"\nEmployee Salary:"+this.countsalary();
                
    }
}