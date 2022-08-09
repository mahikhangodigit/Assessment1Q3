import java.util.Scanner;
import java.util.*;

public class Salary1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        int BS=sc.nextInt();//Taking input for basic salary
        if(BS<1)
        {
            System.out.println("Please enter valid value");
        }
        else {
            System.out.println("Continue...");
        }

        double HRA=BS*0.1; //calculating House Rent Allowences
        double DA=BS*0.1; //calculating Dearness Allowences
        double PF=BS*0.1; //calculating Provident Fund
        double Gross_Sal=(BS+HRA+DA); //calculating Gross Salary
        double Net_Sal=(Gross_Sal-PF); //calculating Net Salary
        double Annual_Package=(Gross_Sal+PF)*12; //calculating Anual Package
        System.out.println("House Rent Allowences: "+HRA);
        System.out.println("Dearness Allowences: "+DA);
        System.out.println("Provident Fund: "+PF);
        System.out.println("Gross Salary: "+Gross_Sal);
        System.out.println("Net Salary: "+Net_Sal);
        System.out.println("Annual Package "+Annual_Package);
    }
}

