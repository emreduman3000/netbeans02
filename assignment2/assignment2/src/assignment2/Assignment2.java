/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author emreduman
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //Commission commission=new Commission(String);
        Scanner scan=new Scanner(System.in);
        System.out.print("Please Enter Employee's First Name:");
        String FirstName=scan.nextLine();
        System.out.print("Please Enter Employee's Last Name:");
        String LastName=scan.nextLine();
        System.out.print("Please Enter Employee's Social Security Number:");
        int SIN=scan.nextInt();
        System.out.print("Please Enter Employee's Gross Sales:");
        double GrossSales=scan.nextDouble();
        System.out.print("Please Enter Employee's Commission Rate:");
        double CommissionRate=scan.nextDouble();
        System.out.print("Please Enter Employee's Basic Salary:");
        int BasicSalary=scan.nextInt();

        Commission commission=new BaseCommission(FirstName,LastName,
                SIN,GrossSales,CommissionRate,BasicSalary);
        
        System.out.println(commission.toString());

        
        
        
        
        
        
    }
    
}
