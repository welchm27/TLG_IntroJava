package net.flix;

class Movie {
    // fields or instance variables
    private String title;        // defaults to null for any class type
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;       // defaults to null for any class type
    private Genre genre;         // defaults to null for any class type

    // constructor else given free constructor
    // as soon as you write 1, you lose the free empty constructor

    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        this(title);                    // delegate to ctor above me for title
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre){
        this(title, genre);              // delegate to ctor above me for title, genre
        setReleaseYear(releaseYear);     // delegate to its setter for any validation/conversion
        setRevenue(revenue);             // ditto
        setRating(rating);
    }

    // business methods - pause(), play(), stop(), rewind(), fastForward()

    // accessor (get/set) methods - these provide "controlled access" to the object's fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString(){
        // %, adds commas to your revenue, .2 limits the decimals to only 2, f formats it in decimal format (removes the weird 2.2E9 stuff)
        return String.format("Movie: Title=%s // release year=%s // total revenue=%,.2f // Rating=%s // Genre=%s",
                getTitle(),getReleaseYear(),getRevenue(),getRating(),getGenre());


        /*
        return "net.flix.Movie: title=" + getTitle() + " // release year =" + getReleaseYear()
                + " // total revenue =" + getRevenue() + " // net.flix.Rating: " + getRating()
                + ", genre=" + getGenre();  // changing getGenre() in order to get the getDisplay from the
                                            // net.flix.Genre enum

         */
    }
}