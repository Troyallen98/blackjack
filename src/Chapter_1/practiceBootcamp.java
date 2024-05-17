package Chapter_1;

public class practiceBootcamp {
    public static void main(String[] args) {

    basicCalculator(5, 4, 't');

    }
    public static void basicCalculator(double val1, double val2, char operator) {
        double sum = 0;
        if (operator == '+') {
            sum = val1 + val2;
                System.out.println("sum = " + sum);
        } else if (operator == '-') {
            sum = val1 - val2;
                System.out.println("sum = " + sum);
        } else if (operator == '/') {
            sum = val1 / val2;
                System.out.println("sum = " + sum);
        } else if (operator == '*') {
            sum = val1 * val2;
                System.out.println("sum = " + sum);
        } else {
            System.out.println("please provide a valid operator");
        }

    }
}
