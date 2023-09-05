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
    private String brand = "Samsung"; // default brand when nothing added (otherwise null)
    private int volume = 33;  // default value when nothing added (otherwise 0)


    // constructors

    public Television(){
        instanceCount++;  // instanceCount = instanceCount + 1
    }
    public Television(String brand){
        this();
        setBrand(brand);        // delegate to its setter for any validation/conversion
    }

    public Television(String brand, int volume){
        this(brand);            // delegate to ctor above for brand
        setVolume(volume);      // delegate to its setter
    }

    // business methods or operations
    public void turnOn() {
        // call private method for this task
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + getBrand() +" in. TV to volume " + getVolume());
    }
    public void turnOff() {
        System.out.println("Shutting down....goodbye");
    }

    /*
     * accessor methods
     */

    // get and set brand
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    // get and set volume
    public int getVolume() {return volume;}
    public void setVolume(int volume) {this.volume = volume;}

    private boolean verifyInternetConnection(){
        return true; // fake implementation
    }

    // toString method
    public String toString(){
        return "Television brand: " + getBrand() + " // volume = " + getVolume();
    }
}