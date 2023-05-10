class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        return movie.price.getCharge(daysRented, movie);
    }

    int getFrequentRenterPoints() {
        return movie.price.getFrequentRenterPoints(daysRented, movie);
    }


}