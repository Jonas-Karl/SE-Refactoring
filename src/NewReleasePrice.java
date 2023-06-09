public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented, Movie movie) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented, Movie movie) {
        return (daysRented > 1) ? 2 : 1;
    }
}