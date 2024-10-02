package com.pluralsight;
import java.util.*;


public class BasicCalculator {
    public static void main(string[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = s.nextFloat();
        s.nextLine();

        System.out.print("Enter the second number: ");
        float num2 = s.nextFloat();
        s.nextLine();

        System.out.println("Possible calculations: ");
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiply");
        System.out.println("  (D)ivide");
        System.out.print("Please select an option: ");

        String option = s.nextLine();

        if( option.equals("A") ){
            //System.out.println("A was selected");
            float result = num1 + num2;
            System.out.println(num1 + " + " +num2 " = " + result);
        }

        if( option.equals("S") ){
            //System.out.println("S was selected");
            float result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        }

        if( option.equals("M") ){
            //System.out.println("M was selected");
            float result = num1 * num2;
            System.out.println(num1 + " * " +num2 " = " + result);
        }

        if( option.equals("D") ){
            //System.out.println("D was selected");
            float result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }




    }
}
