public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented, Movie movie);

    int getFrequentRenterPoints(int daysRented, Movie movie) {
        return 1;
    }
}
