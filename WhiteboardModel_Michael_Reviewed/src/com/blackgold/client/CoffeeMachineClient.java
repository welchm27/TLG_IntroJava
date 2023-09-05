package com.blackgold.client;

import com.blackgold.CoffeeMachine;
import com.blackgold.MachineType;

/*
 * Client-side main() class.
 */

/**
 * JR: good basic test-drive of a few instances.
 */
class CoffeeMachineClient {
    public static void main(String[] args) {
        CoffeeMachine cm1 = new CoffeeMachine("Breville", MachineType.ESPRESSO);
        cm1.setHasGrinder(true);

        cm1.grind();
        cm1.brew();
        //create line break between instances
        System.out.println();

        CoffeeMachine cm2 = new CoffeeMachine("CuisinArt");

        cm2.grind();
        cm2.brew();
        //create line break for 3rd instance
        System.out.println();

        CoffeeMachine cm3 = new CoffeeMachine("Mueller", MachineType.FRENCH_PRESS);

        cm3.grind();
        cm3.brew();
        System.out.println();

        System.out.println(cm1);  // toString automatically called
        System.out.println(cm2);
        System.out.println(cm3);
    }
}