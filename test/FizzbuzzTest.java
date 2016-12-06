import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ewansheldon on 06/12/2016.
 */
class FizzbuzzTest {

    Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    void returnFizzWhenDivisibleBy3() {
        assertEquals("fizz", fizzbuzz.play(3));
    }

    @Test
    void returnBuzzWhenDivisibleBy5() {
        assertEquals("buzz", fizzbuzz.play(5));
    }
}