package Chapter_1;

import java.util.Map;
import java.util.stream.Collectors;

public class java8solution
{
    public static void main(String[] args)
    {
        //input
        String input = "JavaJavaEEfkskdolf";

        //converts into stream
       Map<Character, Long> result = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

       result.forEach((k, v) -> {
           if(v == 1)
           {
               System.out.println(k + " : " + v);
           }
       });

    }
}
