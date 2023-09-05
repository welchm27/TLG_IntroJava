/*
 * Television volume presets via enum

1. Create an "advanced" enum named VolumeLevel, with 5 volume presets: OFF, SOFT, MEDIUM, LOUD, MAX.
   See Java Part 1 Sessions manual p.128 for an example.

   Each preset carries an int value which represents the actual volume value:
   0, 25, 50, 75, 100, respectively

2. Enhance Television to accept a VolumeLevel, in addition to a simple int, for the desired volume.
   For example:

   Television tv1 = new Television();
   tv1.setVolume(24);  // this should still work (as before)

   Television tv2 = new Television();
   tv2.setVolume(VolumeLevel.LOUD);  // new functionality

3. Implementation notes:
   a) Internally, the Television's volume should continue to be stored in a simple int field.
   b) getVolume() should still return an int for the actual volume value, so continuing the example above:

   tv1.getVolume() returns 24
   tv2.getVolume() returns 75

 */

class TelevisionVolumePresetsClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setVolume(24);
        System.out.println(tv1);
        
    }
}