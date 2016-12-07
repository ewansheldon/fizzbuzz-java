import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    Fizzbuzz fizzbuzz = new Fizzbuzz();

    @Test
    void returnFizzWhenDivisibleBy3() {

        assertEquals("fizz", fizzbuzz.play(3));
        assertEquals("fizz", fizzbuzz.play(9));
    }

    @Test
    void returnBuzzWhenDivisibleBy5() {

        assertEquals("buzz", fizzbuzz.play(5));
        assertEquals("buzz", fizzbuzz.play(40));
    }

    @Test
    void returnFizzbuzzWhenDivisibleBy3And5() {

        assertEquals("fizzbuzz", fizzbuzz.play(15));
        assertEquals("fizzbuzz", fizzbuzz.play(60));
    }

    @Test
    void returnIntegerIfNotDivisibleBy3Or5() {

        assertEquals("4", fizzbuzz.play(4));
        assertEquals("82", fizzbuzz.play(82));
    }
}