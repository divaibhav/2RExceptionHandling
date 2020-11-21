/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 20-Nov-20
 *  Time: 5:52 PM
 */
package com.myname.student;

public class Student {
    private String name;
    private int rollNo;
    private double cpi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", cpi=" + cpi +
                '}';
    }
}
