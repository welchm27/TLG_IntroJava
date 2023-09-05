package dont.wakeme;

/*
 * Class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class".
 * This class definition does NOT have a main() method - most classes don't.
 * Only one class will be main(), it is the class that kicks off the code.
 */
class AlarmClock {
    // class-level (shared) variables - these live in that shared/common area "above the instances
    // there is ONLY 1 COPY of these, up in that shared/common area
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // properties or attributes - called "instance variables" or "fields" in Java
    private int snoozeInterval = 5;  // default value when client doesn't specify one, otherwise it's 0
    private int repeat = 1;          //default value when client doesn't specify

    // constructors (ctors) go between the fields and methods
    public AlarmClock(){
        // no-operation, created to allow blank fields when creating a new clock without getting an error
    }

    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval);  // delegate to setter for any validation/conversion
    }

    public AlarmClock(int snoozeInterval, int repeat){
        this(snoozeInterval);           // delegate to ctor above instead of typing "setSnoozeInterval" again
        setRepeat(repeat);              //delegate to setter for repeat
    }

    // business methods - these perform "business tasks" or operations
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    // accessor methods (get/set methods) - provide "controlled access" to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // DONE: business constraint - must be between [1,20] inclusive
    // No "magic numbers" 1 and 20.  Use variables instead.
    public void setSnoozeInterval(int snoozeInterval) {
       if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL){    // valid
           this.snoozeInterval = snoozeInterval;
       }
       else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval +
                    ", must be between: " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
       }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString(){
        return "dont.wakeme.AlarmClock: snoozeInterval=" + getSnoozeInterval() + ", repeat=" + getRepeat();
    }
}