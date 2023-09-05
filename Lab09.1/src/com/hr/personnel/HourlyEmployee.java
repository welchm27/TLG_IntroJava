package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // instance variables (fields)
    private double rate;
    private double hours;

    // constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);          // delegate to the superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
        this(name, hireDate);          // delegate to the above ctor for name, hireDate
        setRate(rate);                  // delegate to the setters for validation/conversion
        setHours(hours);
    };

    // business methods or "action" methods
    @Override
    public void pay() {
        double payment = getRate() * getHours();        // because it's so short, you could also just inline this with the println
        System.out.println(getName() + " is paid hourly " + payment);
    }

    @Override
    public void payTaxes() {
        double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    // accessor methods (getters/setters)
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() +           // starting with toString from Employee class
                ", rate=" + getRate() +", hours=" + getHours();     // concatenate with super toString
    }
}