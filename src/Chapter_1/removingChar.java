package Chapter_1;

import java.util.regex.Pattern;

public class removingChar
{
    public static void main(String[] args)
    {
        replaceAllFor("apple", 'p');
        replaceAll("apples", 'p');
    }
    public static void replaceAll(String word, char ch)
    {
        System.out.println(word.replaceAll(Pattern.quote(String.valueOf(ch)), ""));

    }

    public static void replaceAllFor(String word, char ch)
    {
        StringBuilder sb = new StringBuilder();
        char[] chArray = word.toCharArray();

        for (char c:
             chArray)
        {
            if (c != ch)
            {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }

}
