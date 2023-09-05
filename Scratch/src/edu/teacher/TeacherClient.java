package edu.teacher;

class TeacherClient {
    public static void main(String[] args) {
        // create TrainingCompany object
        TrainingCompany comp = new TrainingCompany("TLG", "JBLM");
        System.out.println(comp);

        // add trainers
        comp.addTrainer(new Trainer("Jay", "Software Development"));

        // list trainers
        System.out.println("\n List Trainers");
        comp.listTrainers();

        // make them teach
        System.out.println("\n Make trainers teach");
        comp.educatorsTeach();

        // MichaelWelchInc greeting
        String greeting = "\n" +
                "          (\\_/) \n" +
                "          (0.0) \n" +
                "          (m m)o \n" +
                "Developed by MichaelWelch Inc.";
        System.out.println(greeting);
    }

}