import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CustomerTest {

    private Customer customerObject;
    private final String customerName = "SomeCustomer";

    @BeforeEach
    public void setCustomerObject() {
        customerObject = new Customer(customerName);
    }

    @Test
    public void addSingleRentalTest() {
        Movie someMovie = new Movie("someMovieTitle", Movie.REGULAR);
        Rental someRental = new Rental(someMovie, 0);

        customerObject.addRental(someRental);

        assertTrue(customerObject.getRentals().contains(someRental));
        assertEquals(1, customerObject.getRentals().size());
    }

    @Test
    public void addMultipleRentalTest() {
        Movie someMovie = new Movie("someMovieTitle", Movie.REGULAR);
        Rental someRental = new Rental(someMovie, 0);
        Movie anyMovie = new Movie("anyMovieTitle", Movie.CHILDRENS);
        Rental anyRental = new Rental(anyMovie, 8);

        customerObject.addRental(someRental);
        customerObject.addRental(anyRental);

        assertTrue(customerObject.getRentals().contains(someRental));
        assertTrue(customerObject.getRentals().contains(anyRental));
        assertEquals(2, customerObject.getRentals().size());
    }

    @Test
    public void getNameTest() {
        assertEquals(customerName, customerObject.getName());
    }

    @Test
    public void getRentalsInitiallyTest() {
        assertEquals(0, customerObject.getRentals().size());
    }

    @Test
    public void statementTest() {
        String someMovieTitle = "someMovieTitle";
        int someDays = 12;
        Movie someMovie = new Movie(someMovieTitle, Movie.REGULAR);
        Rental someRental = new Rental(someMovie, someDays);


        customerObject.addRental(someRental);


        assertTrue(customerObject.statement().startsWith("Rental Record for " + customerName));
        assertTrue(customerObject.statement().contains(someMovieTitle));
        assertTrue(customerObject.statement().contains(String.valueOf(someDays)));
    }

    @Test
    public void htmlStatementTest(){
        String someMovieTitle = "someMovieTitle";
        int someDays = 12;
        Movie someMovie = new Movie(someMovieTitle, Movie.REGULAR);
        Rental someRental = new Rental(someMovie, someDays);


        customerObject.addRental(someRental);

        assertTrue(customerObject.htmlStatement().startsWith("<H1>Rentals for <EM>" + customerName));
        assertTrue(customerObject.htmlStatement().contains(someMovieTitle));
    }

}
    