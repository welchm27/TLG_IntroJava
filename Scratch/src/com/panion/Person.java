package com.panion;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class.
 *
 * More accurately, it's a class definition written in such a way that
 * instances of it (Person objects), once created, can't have their properties changed.
 *
 * In the code, this simply means no public setters.
 */
class Person {
    // these have getters but no setters, effectively making them read-only
    private final String name;
    private final LocalDate birthDate;

    // Constructor in order to change the fields within the instance
    // The methods above are unable to be altered
    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    /*
     * Returns the person's age in whole years.
     * HINT: See a class in package java.time that can help you return
     * the *period* of time *between* two dates.
     */
    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
        }

    @Override
    public String toString() {
        return String.format("Person: name=%s, birthdate=%s",
                getName(),getBirthDate());

        // return "Person: name=" + getName() +", birthDate=" + getBirthDate();
    }
}