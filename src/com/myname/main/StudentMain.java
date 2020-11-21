/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 21-Nov-20
 *  Time: 10:22 AM
 */
package com.myname.main;

import com.myname.exception.InvalidStudentException;
import com.myname.student.Student;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student[] list = new Student[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list[i] = new Student();
            System.out.println("enter name of student " + i+1);
            list[i].setName(sc.nextLine());
            System.out.println("enter rollNo of student " + i+1);
            list[i].setRollNo(sc.nextInt());
            System.out.println("enter cpi of student " + i+1);
            list[i].setCpi(sc.nextDouble());

            sc.nextLine();//to skip \n left by nextDouble, happens when read string after number
        }
        StudentMain obj = new StudentMain();
        try {
            Student result = obj.search(list, 12);
            System.out.println(result);
        }
        catch (InvalidStudentException e){
            System.out.println(e.getMessage());

        }

    }
    public Student search(Student[] list, int rollNo) throws InvalidStudentException{
        Student response = null;
        for (Student student : list) {
            if(student.getRollNo() == rollNo){
                response = student;
                break;
            }
        }
        if(response == null){
            InvalidStudentException e = new InvalidStudentException("student not found");
            throw e;
        }
        return response;
    }
}
