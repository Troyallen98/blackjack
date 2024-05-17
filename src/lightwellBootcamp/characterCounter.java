package lightwellBootcamp;

import java.util.HashMap;
import java.util.Map;

public class characterCounter
{
    public static void main(String[] args)
    {
        count("AABBCCDDee");// should return True
    }
    public static void count(String word)
    {
        Map<Character, Integer> results = new HashMap<>();
        boolean status = true;
        word = word.toLowerCase();

        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);

            results.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
        }

        int expectedNumberOfCharacters = 0;
        for(char key: results.keySet())
        {
            if(expectedNumberOfCharacters == 0)
            {
                expectedNumberOfCharacters = results.get(key);
            }
            if(results.get(key) != expectedNumberOfCharacters)
            {
                status = false;
            }
        }
        System.out.print(status);
    }
}
