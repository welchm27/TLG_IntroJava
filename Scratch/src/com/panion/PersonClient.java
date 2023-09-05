package com.panion;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Adrienne", LocalDate.of(1986,02,06));
        System.out.println(p1);

        // TODO: print "<name> is <age> years old
        System.out.printf("%s is %s years old.\n",
                p1.getName(),p1.getAge());
        System.out.println("done");
        System.out.println();
    }
}