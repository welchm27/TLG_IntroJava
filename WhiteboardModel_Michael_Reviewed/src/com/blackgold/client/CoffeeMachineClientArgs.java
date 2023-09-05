package com.blackgold.client;/*
 * Intended usage:
 *  java.CoffeeMachineClientArgs <brand> <type> <hasGrinder>
 * Example:
 * java.CoffeeMachineClientArgs Breville Espresso True
 *
 * look at TelevisionClientArgs in Lab02.2 for a template
 */

import com.blackgold.CoffeeMachine;
import com.blackgold.MachineType;

import java.util.Arrays;

/**
 * JR: very good overall.
 * Works correctly, and good usage banner.
 * See comment below about unnecessarily calling business methods on the new CoffeeMachine object.
 */
class CoffeeMachineClientArgs {
    public static void main(String[] args) {
        // must first check for presence of required 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java CoffeeMachineClientArgs <brand> <type> <hasGrinder>";
            String example = "Example: java CoffeeMachineClientArgs Breville Espresso True";
            String note1 = "Note: supported types are: " + Arrays.toString(MachineType.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            return;   // early return if not all the required arguments are entered
        }
        // Step 1: Convert the arguments into proper types
        String brand = args[0];
        MachineType type = MachineType.valueOf(args[1].toUpperCase());
        boolean hasGrinder = Boolean.parseBoolean(args[2]);

        // Step 2: create a coffeeMachine from these items
        CoffeeMachine cm = new CoffeeMachine(brand, type, hasGrinder);

        // JR: not really appropriate to call business methods on this newly-ordered item,
        // just instantiate, thank them, and print it.
        cm.grind();
        cm.brew();

        // Step 3: Print it and thank the customer
        System.out.println("Thank you, your order will be processed and your new Coffee Machine " +
                "will arrive in 3-5 business days!");
        System.out.println(cm);

    }
}