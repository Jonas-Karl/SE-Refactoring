import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MovieTest {

    private Movie movieObject;
    private final String someMovieTitle = "someMovieTitle";
    private final int somePriceCode = Movie.NEW_RELEASE;

    @BeforeEach
    public void setMovieObject() {
        movieObject = new Movie(someMovieTitle, somePriceCode);
    }

    @Test
    public void getPriceCodeTest() {
        assertEquals(movieObject.getPriceCode(), somePriceCode);
    }

    @Test
    public void setPriceCodeTest() {
        int earlyPriceCode = movieObject.getPriceCode();
        int anyPriceCode = Movie.REGULAR;

        movieObject.setPriceCode(anyPriceCode);

        assertEquals(movieObject.getPriceCode(), anyPriceCode);
        assertEquals(earlyPriceCode, somePriceCode);
    }

    @Test
    public void getTitleTest() {
        assertEquals(someMovieTitle, movieObject.getTitle());
    }

}