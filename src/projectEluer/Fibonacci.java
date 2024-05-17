package projectEluer;

public class Fibonacci {

    public static final int UPPER_BOUND = 4_000_000;
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.evenSumOfFibonacci(1, 2, 2);
        System.out.println(result);

    }

//    By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
    // first 10
    // 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

    // 1. create method that takes upper bound
    // 2. create iterator to upper bound.
    // 3. given two terms add together

    public int evenSumOfFibonacci(int firstTerm, int secondTerm, int sum) {

        int result = firstTerm + secondTerm;

        if (result >= UPPER_BOUND) {
            return sum;
        } else {
            if (result % 2 == 0) {
                sum += result;
            }
            System.out.println(sum);
            return evenSumOfFibonacci(secondTerm, result, sum);
        }
    }


}
