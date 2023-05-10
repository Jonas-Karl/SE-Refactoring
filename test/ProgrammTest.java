import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgrammTest {

    @Test
    public void testResultString() {
        String resultString = """
                Rental Record for joe
                	Title		Days	Amount
                	movie1		10	30.0
                	movie2		5	4.5
                Amount owed is 34.5
                You earned 3 frequent renter points""";
        assertEquals(resultString,mainExample());
    }

    private String mainExample() {
        String result;
        System.out.println("Welcome to the Movie Store");
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);
        c1.addRental(r2);
        System.out.println("Let's get the Statement");
        result = c1.statement();
        return result;
    }
}
