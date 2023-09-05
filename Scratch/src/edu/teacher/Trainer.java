package edu.teacher;

class Trainer implements Teacher {
    // static methods, shared by all

    // instance variables or fields
    private String name;
    private String course;

    // constructors
    public Trainer() {

    }

    public Trainer(String name, String course) {
        setName(name);
        setCourse(course);
    }

    // business methods
    @Override
    public void educatorsTeach() {
        System.out.println(" trains a room full of SDE students");
    }

    // accessor methods
    // get/set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString method
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName() + ", course=" + getCourse();
    }
}