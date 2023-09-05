enum VolumeLevel {
    OFF (0),        // Volume at 0
    SOFT (25),       // Volume at 25
    MEDIUM (50),     // Volume at 50
    LOUD (75),       // Volume at 75
    MAX (100);        // Volume at 100

    private final int volume;       // volume set at VolumeLevel
    VolumeLevel(int volume){        // Constructor
        this.volume = volume;
    }
    public int volume(){            // getter method
        return volume;
    }

}