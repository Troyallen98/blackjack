package Chapter_1;

public class longestCommonPrefix
{
    public static void main(String[] args)
    {
        String[] words = new String[] {
                "abc",
                "abcd",
                "ab",
                "accd",
                "abd",
                "abcde",
                "abcd",
                "abcdef"
        };

        commonPrefix(words);

    }
    public static void commonPrefix(String[] words)
    {
        if (words.length == 1)
        {
            System.out.println(words[0]);
        }

        int firstLen = words[0].length();
        //loop through and find the longest common subString.
        for (int i = 0; i < firstLen; i++)
        {
            char ch = words[0].charAt(i);

            for (int j = 1; j < words.length; j++)
            {
                if (i >= words[j].length() || words[j].charAt(i) != ch)
                {
                    System.out.println(words[j].substring(0, i));
                }
            }
        }
    }

}
