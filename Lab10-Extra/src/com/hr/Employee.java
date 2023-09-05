package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * OPTION 4: try-catch and throw a different type of exception
     * Instead of throwing the low-level "infrastructure" transportation exception,
     * we'll throw a higher-level more suitable exception for our HR client.
     */
    public void goToWork() throws WorkException {

        Car c = new Car("CVK123","Chevy", "Silverado");
        c.start();
        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);    // e is the nested 'cause'
        }
        finally {
            c.stop();
        }
    }

    /*
     * OPTION 3: try-catch and "react in some way," then throw it back to my client.
     * This is sometimes called a catch-and-rethrow.
     */
    /*
    public void goToWork() throws DestinationUnreachableException {

        Car c = new Car("CVK123","Chevy", "Silverado");
        c.start();
        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println("Send email to Lisa Herbold to complain");
            throw e;
        }
        finally {
            c.stop();
        }
    }
     */
    /*
     * Option 2: "punt" (do not handle the exception)
     * throw to EmployeeClient to handle
     * Important that stop() is called no matter what.
     *
     * We use a try-finally, which allows us to "punt" and still get the call to c.stop() to always happen.
    */
    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("CVK123","Chevy", "Silverado");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        finally {
            c.stop();       // IMPORTANT to always get called
        }

    }
    */
    /*
     * OPTION 1: Try-Catch and handle.
     * NOTE that we use a finally block to ensure that stop() is always called:
     * if exception is/is not thrown
     */
    /*
    public void goToWork() {

        Car c = new Car("CVK123","Chevy", "Silverado");
        c.start();
        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            // System.out.println(e);      // toString() automatically called (e) is a ref to the exception object in car with the print statement
            System.out.println(e.getMessage());         // e.getMessage will only print out the reason String in the exception.
        }
        finally {
            c.stop();
        }
    }
    */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}