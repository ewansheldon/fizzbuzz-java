import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void returnFizzbuzzWhenDivisibleBy3And5() {
        assertEquals("fizzbuzz", fizzbuzz.play(15));
    }

    @Test
    void returnIntegerIfNotDivisibleBy3Or5() {
        assertEquals("4", fizzbuzz.play(4));
    }
}