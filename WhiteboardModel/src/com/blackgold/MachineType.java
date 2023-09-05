package com.blackgold;

/*
 * An enum with 3 instances of MachineType.
 * They are referenced as:
 * MachineType.ESPRESSO
 * MachineType.DRIP_POT
 * MachineType.FRENCH_PRESS
 */
public enum MachineType {
    // these call to the ctor below, passing the display String
    ESPRESSO("Espresso"),
    DRIP_POT("Drip Pot"),
    FRENCH_PRESS("French Press");

    // everything below here is regular class items
    private final String display;       // final not actually required, used to display intent

    // ctor - implicitly private, only called from inside
    MachineType(String display) {
        this.display = display;
    }

    // accessor methods - provide "read-only" access to display property
    public String display() {
        return display;
    }

    // custom toString in order to call the getDisplay above
    public String toString() {
        return display();
    }
}