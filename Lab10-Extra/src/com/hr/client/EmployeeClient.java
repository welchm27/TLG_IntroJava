package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee("Michael");

        try {
            emp.goToWork();
        }
        catch (WorkException e) {
            // System.out.println(e);           // toString()
            // System.out.println(e.getMessage()); // just the reason string
            // e.printStackTrace();        // will print the chain of events and the "caused by" that led to the exception
            System.out.println(e.getCause());  // will only print the "caused by" line of the events
        }
    }
}