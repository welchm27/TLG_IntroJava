/*
 * Business class (system class) to model the workings of a television.
 */
class Television {
    // static methods, shared by all
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    // static getter to instanceCount (no setter makes it read-only)
    public static int getInstanceCount() {
        return instanceCount;
    }

    // instance variables or fields (properties or attributes)
    private String brand = "Samsung";               // default brand when nothing added (otherwise null)
    private int volume = 33;                        // default value when nothing added (otherwise 0)
    private DisplayType display = DisplayType.LED;  // otherwise, null if client doesn't say
    private VolumeLevel volPres = VolumeLevel.MEDIUM;

    private boolean isMuted;  // mute status
    private int oldVolume;

    // check for volume presets, if there's a match, it'll return it.


    // constructors

    public Television() {
        instanceCount++;  // instanceCount = instanceCount + 1
    }

    public Television(String brand) {
        this();
        setBrand(brand);        // delegate to its setter for any validation/conversion
    }

    public Television(String brand, int volume) {
        this(brand);            // delegate to ctor above for brand
        setVolume(volume);      // delegate to its setter
    }

//    public Television(String brand, Integer VolumeLevel) {
//        this(brand);
//        int vol = VolumeLevel.intValue();
//        setVolume(vol);
//    }

    public Television(String brand, int volume, DisplayType display){
        this(brand, volume);
        setDisplay(display);
    }

    // business methods or operations
    public void turnOn() {
        // call private method for this task
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + getBrand() + " in. TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down....goodbye");
    }

    public void mute() {
        if (!isMuted()) {
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;
        }
        else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }

    /*
     * accessor methods
     */

    // get and set brand
    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        // if-else for brand validation
        if (brand.equals("Samsung") ||
            brand.equals("LG")      ||
            brand.equals("Sony")    ||
            brand.equals("Toshiba")) {
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand name: " + brand + ", brand options are: " +
                    "Samsung, LG, Sony, or Toshiba");
        }
    }

    // get and set volume
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        // set volume constraints
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {  // valid volume
            this.volume = volume;                           // will change the volume as entered
            // clear the 'isMuted' flag, in case we were muted
            isMuted = false;
        }
        else {
            System.out.println("Invalid volume: " + volume + ", must be between: " +
                    MIN_VOLUME + " and " + MAX_VOLUME);     // else error and leave volume alone
        }
    }

    // get/set for DisplayType enum

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    // mute
    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    // toString method

    public String toString() {
        // if adding an INT to a String, you need String.valueOf...
        String volumeString = isMuted() ? "<MUTED>" : String.valueOf(getVolume());
        return "Television: brand =" + getBrand() + ", display type: " + display + ", volume=" + volumeString;
    }
}