package Chapter_1;

import java.util.stream.IntStream;

public class palindrome
{
    // check to see if a string is spelled the same backwards
    public static void main(String[] args)
    {
        isPalindromeWhile("hahah");
        isPalindromeFor("hahah");
        isPalindromeStream("hahsah");
    }

    public static void isPalindromeWhile(String word)
    {
        int left = 0;
        int right = word.length() - 1 ;
      while (right > left)
      {
          if(word.charAt(left) != word.charAt(right))
          {
              System.out.println("false");

          }
          right--;
          left++;
      }
      System.out.println("true");

    }

    public static boolean isPalindromeFor(String word)
    {
       int number = word.length();
       for (int i = 0; i < number/2; i++)
       {
           if(word.charAt(i) != word.charAt(number - i - 1 ))
           {
               System.out.println("false");
               return false;
           }
       }

       System.out.println("true");
       return true;
    }
    public static boolean isPalindromeStream(String word)
    {
        System.out.println(IntStream.range(0, word.length()/2).noneMatch(p -> word.charAt(p) != word.charAt(word.length() - p - 1)));
        return IntStream.range(0, word.length()/2).noneMatch(p -> word.charAt(p) != word.charAt(word.length() - p - 1));
    }
}
