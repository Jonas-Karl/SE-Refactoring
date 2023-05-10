import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RentalTest {

    private Rental rentalObject;
    private final int someDaysRented = 4;
    private final Movie someMovie = new Movie("someMovieTitle", Movie.NEW_RELEASE);

    @BeforeEach
    public void setMovieObject() {
        rentalObject = new Rental(someMovie,someDaysRented);
    }

    @Test
    public void getDaysRentedTest() {
        Assertions.assertEquals(rentalObject.getDaysRented(), someDaysRented);
    }

    @Test
    public void getMovie() {
        Assertions.assertEquals(rentalObject.getMovie(), someMovie);
    }
}