package projectEluer;

import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();

        primeFactors.largestPrimeFactor(500L);
    }

    private long largestPrimeFactor(long number) {
        // special cases a prime number must be greater than 1
            // 1
            // 0
        if (number <= 1) {
            throw new IllegalArgumentException("prime numbers must be greater than 1");
        }

        long largestPrimeFactor = 0;

        // check to see if 2 work first
        while (number % 2 == 0) {
            largestPrimeFactor = 2;
            number /= 2;
        }

        // since we check to see if 2s work first we can start at the next prime factor 3 and increment by 2

        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestPrimeFactor = number;
        }

        System.out.println("largestPrimeFactor = " + largestPrimeFactor);
        return largestPrimeFactor;
    }


}
