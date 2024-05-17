package Chapter_1;

import java.util.stream.IntStream;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        fizzBuzzStream(105);
        //fizzBuzzFor(100);
    }
    public static void fizzBuzzStream(int number)
    {
        IntStream
                .rangeClosed(1, number)
                    .mapToObj(i -> i % 3 == 0 ? ( i % 5 == 0 ? "FizzBuzz ":"Buzz "):( i % 5 == 0 ? "Fizz ": String.valueOf(i)))
                    .forEach(System.out::println);
    }
    public static void fizzBuzzFor(int number)
    {
        for(int i = 1; i < number; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Buzz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
