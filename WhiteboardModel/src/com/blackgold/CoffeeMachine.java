package com.blackgold;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
 * Business class to identify coffee machine properties and functions.
 */
public class CoffeeMachine {
    // static field for coffee grounds (will only change IF getting new coffee
    private static final String grounds = "Cactus Creek";
    // grind date set to day of operation, to set expiration to 1 week after.
    private LocalDate groundOpenDate = LocalDate.now();

    private String brand = "Breville";
    private MachineType type = MachineType.ESPRESSO; // constraint: ["espresso", "drip_pot", "french_press"]
    private boolean hasGrinder;
    private final LocalDate date = LocalDate.now();
    private final DayOfWeek today = date.getDayOfWeek();

    //CTORs:
    public CoffeeMachine() {
    }

    public CoffeeMachine(String brand) {
        setBrand(brand);
    }

    public CoffeeMachine(String brand, MachineType type) {
        this(brand);
        setType(type);
    }

    public CoffeeMachine(String brand, MachineType type, boolean hasGrinder) {
        this(brand, type);
        setHasGrinder(hasGrinder);
    }

    // brew your coffee
    public void brew() {
        System.out.printf("Brewing your %s %s on your %s machine for %s %s \n",
                CoffeeMachine.grounds, type, brand, today, date);
    }

    // does this have a grinder
    public void grind() {

        if (hasGrinder) {  // valid true
            System.out.printf("Grinding your %s beans! They will be good until: %s \n",
                    grounds, groundOpenDate.plusWeeks(1));
        } else {
            System.out.println("This machine doesn't have a grinder.  You need to grind separately.");
        }
    }

    // assign getters and setters
    // get/set for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // get/set for type
    public MachineType getType() {
        return type;
    }

    public void setType(MachineType type) {
        this.type = type;
    }

    // get/set for hasGrinder
    public boolean isHasGrinder() {
        return hasGrinder;
    }

    public void setHasGrinder(boolean hasGrinder) {
        this.hasGrinder = hasGrinder;
    }

    // get/set for groundOpenDate
    public LocalDate getGroundOpenDate() {
        return groundOpenDate;
    }

    public void setGroundOpenDate(LocalDate groundOpenDate) {
        this.groundOpenDate = groundOpenDate;
    }

    // create toString
    public String toString() {
        // return String.format to use the same format as souf in the toString
        return String.format("Coffee Machine brand: %s // machine type: %s // This machine has a grinder: %s // " +
                        "Able to brew your coffee for morning perfection",
                getBrand(), getType(), isHasGrinder());
    }
}