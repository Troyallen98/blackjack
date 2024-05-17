package projectEluer;

public class ThreeAndFive {
    public static void main(String[] args) {
        ThreeAndFive threeAndFive = new ThreeAndFive();

        threeAndFive.testWithKnownValues();
        System.out.println(threeAndFive.getSumOfMultiples(1000));
    }

//    find the sum of multiples of 3 and 5 below 1000

    private void testWithKnownValues() {
        int input = 10;
        int actual = this.getSumOfMultiples(input);
        int expected = 23;

        System.out.println(expected == actual);
    }

    private int getSumOfMultiples(int value) {

        int sum = 0;

        // 1. iterate over value
        for (int i = 0; i < value; i++) {
        // 2. if divisible by 3 or 5 add to sum.
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        // 4. return sum
        return sum;
    }
}
