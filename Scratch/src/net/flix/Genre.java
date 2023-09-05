package net.flix;

enum Genre {
    // these are the 8 named net.flix.Genre objects (instances)
    // each of these calls the ctor below, passing a display String
    ROMANCE("Romance"),
    SCI_FI("Sci-Fi"),
    COMEDY("Comedy :)"),
    HORROR("HORROR!"),
    DOCUMENTARY("Documentary"),
    ACTION("Action"),
    THRILLER("Thriller"),
    DRAMA("Drama");

    // everything below here is regular class definition stuff, i.e., fields, ctors, methods
    private final String display;  // final not actually required, but added to display intent
                                   // by having a getter and no setter it's effectively final already

    // constructor - implicitly private, only called from inside (8 times above)
    Genre(String display){
        this.display=display;
    }

    // accessor methods - here, we provide "read-only" access to the display property
    public String getDisplay() {  // can also be done with just "display" instead of "getDisplay" since there's no setter
        return display;
    }
    // writing custom toString in order to call the getDisplay above
    // This allows us to concatinate in net.flix.Movie toString
    public String toString() {
        return getDisplay();
    }
}