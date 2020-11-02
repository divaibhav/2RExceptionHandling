/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Oct-20
 *  Time: 11:43 AM
 */
package main;

import java.util.Scanner;

// demonstration for exception handling, using try catch finally. Check division by zero
public class DemoException {
    public static void main(String[] args) {
        int num;
        int den;
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numerator");
        num = sc.nextInt();
        System.out.println("enter a denominator");
        den = sc.nextInt();
        try {
            result = num / den;//exception can come
        }
        //providing handler
        catch (ArithmeticException e){
            //corrective measure, informing user about denominator can not be zero
            System.out.println("Denominator can not be zero");
            result = 0;
            e.printStackTrace();//will print the cause
        }
        System.out.println("result = " + result);
    }
}
