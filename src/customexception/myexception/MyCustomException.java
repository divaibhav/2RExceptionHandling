/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 02-Nov-20
 *  Time: 11:10 AM
 */
package customexception.myexception;
//creating a custom exception class, this exception will be thrown when user enter
// a number less than 100;
public class MyCustomException extends Exception{
    public MyCustomException(String message) {
        super(message);
    }
}
