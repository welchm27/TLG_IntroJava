package com.blackgold.test;

import com.blackgold.CoffeeMachine;
import com.blackgold.MachineType;

/**
 * JR: there is no range-of-values validation testing in this case,
 * but this does show that the "hasGrinder" logic in grind() works correctly.
 * Unnecessary to call brew() on these instances.
 */
class CoffeeMachineValidationTest {
    public static void main(String[] args) {
        CoffeeMachine cm1 = new CoffeeMachine("Breville", MachineType.ESPRESSO, true);
        System.out.println(cm1);

        cm1.grind();
        cm1.brew();
        System.out.println();

        CoffeeMachine cm2 = new CoffeeMachine("Coffee Mate", MachineType.FRENCH_PRESS, false);

        cm2.grind();
        cm2.brew();
        System.out.println();

        CoffeeMachine cm3 = new CoffeeMachine("coffee mate", MachineType.DRIP_POT);
        cm3.grind();
        cm3.brew();
        System.out.println();
    }
}