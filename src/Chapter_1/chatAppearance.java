package Chapter_1;

import java.security.KeyPair;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class chatAppearance
{
    public static void main(String[] args)
    {

        maxOccurrenceCharacter("hellowazzzzzup dudeee");
    }
    public static void maxOccurrenceCharacter(String word)
    {
        Map<Character, Integer> counter = new HashMap<>();
        char[] chArray = word.toCharArray();

        for (int i = 0; i < chArray.length; i++)
        {
            char currentCh = chArray[i];
            if (!Character.isWhitespace(currentCh))
            {
                Integer noCh = counter.get(currentCh);
                if (noCh == null)
                {
                    counter.put(currentCh, 1);
                }
                else
                {
                    counter.put(currentCh, ++noCh);
                }
            }
        }
        int maxOccurrence = Collections.max(counter.values());
        char maxCharacter = Character.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry: counter.entrySet())
        {
            if (entry.getValue() == maxOccurrence)
            {
                maxCharacter = entry.getKey();
            }
        }

        System.out.println(maxCharacter + " : " + maxOccurrence);
    }
}
