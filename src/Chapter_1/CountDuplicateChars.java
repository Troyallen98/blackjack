package Chapter_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CountDuplicateChars
{
    public static void main(String[] args)
    {
        //given input
        String input = "JavaJavaEEhg";
        countingDuplicates(input);

    }
        public static void countingDuplicates(String input) {
            //given input
            //create a hash map
            Map<Character, Integer> countDuplicateMap = new HashMap<>();
            //converts string to array
            char[] charArray = input.toCharArray();

            for(char c : charArray)
            {
                if(countDuplicateMap.containsKey(c))
                {
                    //get value by key and increment its value by 1
                    countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);
                }
                else
                {
                    countDuplicateMap.put(c, 1);
                }
            }
            for(Map.Entry<Character, Integer> entry : countDuplicateMap.entrySet())
            {
                if(entry.getValue() >= 2)
                {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }
        }
}

