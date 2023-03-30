package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        FibonacciSequence sequence = new FibonacciSequence();
        int limit = 4000000;
        int evenNumbersSum = sequence.calculateSum(limit);
        System.out.println("Suma parzystych elementów ciągu Fibonacciego, których wartość nie przekracza " + limit +
                ": " + evenNumbersSum);
    }
}
