package Chapter_1;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class stringLength
{
    public static void main(String[] args)
    {
        String [] words = new String[]{
                "hello",
                "how",
                "are",
                "you",
                "I"
        };
        sortStringLength(words, "asc");
    }
    public static void sortStringLength(String[] strings, String direction)
    {
        String[] results;
        if ("asc".equals(direction))
        {
            results = Arrays.stream(strings)
                    .sorted(Comparator.comparingInt(String::length))
                    .toArray(String[]::new);
        }
        else
        {
            results = Arrays.stream(strings)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .toArray(String[]::new);


        }
        Arrays.stream(results).forEach(System.out::println);
    }
}
