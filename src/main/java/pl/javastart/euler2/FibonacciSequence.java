package pl.javastart.euler2;

public class FibonacciSequence {

    int calculateSum(int limitNumber) {
        int evenNumbersSum = 0;
        int a = 1;
        int b = 2;
        int result = 3;
        for (int i = 1; i < limitNumber; i = b) {
            if (b % 2 == 0) {
                evenNumbersSum += b;
            }
            a = b;
            b = result;
            result = a + b;
        }
        return evenNumbersSum;
    }
}
