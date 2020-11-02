/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-20
 *  Time: 11:12 AM
 */
package customexception.main;
// ask the user to enter a value greater than 100, if he enters smaller value
// throw an exception MyCustomException and print the message value cannot be small than
// 100. otherwise print value if greater than 100

import customexception.myexception.MyCustomException;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//we can solve this by creating method
// we can directly solve in main method.
public class MyMain {
    public static void main(String[] args) {
        try {
            checkInput();
        }
        catch (MyCustomException  | NoSuchElementException | IllegalStateException e){
            //printing the object of exception, to know the class of it.
            System.out.println(e);
            //printing the message associated with exception object,
            System.out.println(e.getMessage());
            //printing the stack trace, to identify all the open method
            e.printStackTrace();


        }
    }
    public static void checkInput() throws MyCustomException {
        Scanner sc = new Scanner(System.in);
        int no;
        
        System.out.println("enter a value greater than 100");
        no = sc.nextInt();
        if(no > 100){
            System.out.println("value is greater than hundred");
        }
        else{
            throw new MyCustomException("Value cannot be smaller than 100");
        }

    }
}
