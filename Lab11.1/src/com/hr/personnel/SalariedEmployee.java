package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // instance variables or fields
    private double salary;

    // constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);              // delegate to superclass ctor for name, hireDate
        // enrollIn401k();
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);              // delegate to above ctor for name, hireDate
        setSalary(salary);                  // delegate to setter for validation/conversion
    }

    // business methods or "action" methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override
    public void payTaxes() {
        double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    @Override
    public double getStandardDeduction() {
        return 10_000.0;
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    // accessor methods (getters/setters)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString () {
        return super.toString() +               // starting with toString from Employee
                ", salary =" + getSalary();     // concatenate with super toString
    }
}