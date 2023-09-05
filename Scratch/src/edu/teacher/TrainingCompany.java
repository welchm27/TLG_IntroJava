package edu.teacher;

class TrainingCompany implements Teacher {
    // instance variables
    private String name;
    private String location;
    private Trainer[] educators = new Trainer[100];
    private int currentIndex = 0;   // start array at 0

    // constructors
    public TrainingCompany(){

    }

    public TrainingCompany(String name, String location){
        setName(name);
        setLocation(location);
    }

    // business methods (actions)
    public void listTrainers(){
        for (int i = 0; i < currentIndex; i++){         // start at 0 array slot and call items until at currentIndex
                System.out.println(educators[i]);           // print toString() for each item called
        }
    }

    @Override
    public void educatorsTeach(){
        for (int i = 0; i < currentIndex; i++){         // start at 0 array slot and call items until at currentIndex
            educators[i].educatorsTeach();           // print toString() for each item called
        }
    }

    // helper method to add a Trainer
    public void addTrainer(Trainer tner) {      // tner is a reference to an object
        educators[currentIndex++] = tner;
    }

    // accessor methods (get/set)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // toString
    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name =" + getName() + ", course=" + getLocation();
    }
}