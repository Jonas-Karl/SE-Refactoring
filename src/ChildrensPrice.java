public class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented, Movie movie) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}