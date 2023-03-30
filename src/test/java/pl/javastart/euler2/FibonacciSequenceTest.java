package pl.javastart.euler2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {

    private FibonacciSequence fibonacciSequence = new FibonacciSequence();

    @Test
    void shouldReturn4613732For4000000() {
        //when
        int result = fibonacciSequence.calculateSum(4000000);
        //then
        assertEquals(4613732, result);
    }

    @Test
    void shouldReturn0For0() {
        //when
        int result = fibonacciSequence.calculateSum(0);
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldReturn0For1() {
        //when
        int result = fibonacciSequence.calculateSum(1);
        //then
        assertEquals(0, result);
    }

    @Test
    void shouldReturn2For2() {
        //when
        int result = fibonacciSequence.calculateSum(2);
        //then
        assertEquals(2, result);
    }
}