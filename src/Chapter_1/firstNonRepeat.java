package Chapter_1;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeat
{
    public static void main(String[] args)
    {
        String input = "AABCCDEERSSFSSGS";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);

            if (map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            } else
            {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> entrySet : map.entrySet())
        {
            if(entrySet.getValue()==1)
            {
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }
}
