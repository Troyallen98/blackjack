package Chapter_1;

import java.util.Locale;
//try to refactor with java 8
public class vowelConsonants
{
    public static void main(String[] args)
    {
        int vowelCount = 0;
        int consonantCount = 0;

        String input = "Today we will learn simple java";

        input = input.toLowerCase();

        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e'|| input.charAt(i) == 'i'|| input.charAt(i) == 'o'|| input.charAt(i) == 'u')
            {
                vowelCount++;
            }
            //could be used instead of the two else statements
//            else if(input.charAt(i)>='a'&&input.charAt(i)<='z')
//            {
//                consonantCount++;
//            }
            else if(input.charAt(i) == ' ')
            {
                continue;
            }
            else
            {
                consonantCount++;
            }
        }
        System.out.println("count of vowels: " + vowelCount);
        System.out.println("count of consonants: " + consonantCount);
    }
}
