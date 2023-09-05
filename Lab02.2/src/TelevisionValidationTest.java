class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(0);        // should stick
        System.out.println(tv);
        System.out.println();

        tv.setVolume(-1);       // should get an error, and volume still set to 0
        System.out.println(tv);
        System.out.println();

        tv.setVolume(100);
        System.out.println(tv); // should stick
        System.out.println();

        tv.setVolume(101);
        System.out.println(tv); // should get an error, and volume still set to 100

        tv.setBrand("Samsung");
        System.out.println(tv);  // should be good

        tv.setBrand("LG");
        System.out.println(tv);  // should be good

        tv.setBrand("Sony");
        System.out.println(tv);  // should be good

        tv.setBrand("Toshiba");
        System.out.println(tv);  //should be good

        tv.setBrand("INVALID");
        System.out.println(tv);  // should get an error message
    }
}