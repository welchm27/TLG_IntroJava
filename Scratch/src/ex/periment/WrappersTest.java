package ex.periment;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "38";
        int age = Integer.parseInt(ageInput);              // returns a int
        Integer ageInteger = Integer.valueOf(ageInput);   // makes Integer objects from Strings

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);   // returns a little l long
        Long populationLong = Long.valueOf(populationInput); // returns a big L long

        String salaryInput = "35000.0";
        double salary = Double.parseDouble(salaryInput);
        Double salaryDouble = Double.valueOf(salaryInput);

        String isCloudyInput = "true";
        boolean isCloudy = Boolean.parseBoolean(isCloudyInput);
        Boolean isCloudyBoolean = Boolean.valueOf(isCloudyInput);

    }
}