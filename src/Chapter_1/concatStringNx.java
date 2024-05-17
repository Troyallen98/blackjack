package Chapter_1;



public class concatStringNx
{
    public static void main(String[] args)
    {
        concatString("damn", 5);
        concatStringRepeat("damn", 5);
        hasOnlySubStrings("damdam");
    }
    public static void concatString(String word, int n)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++)
        {
            sb.append(word);
        }
        System.out.println(sb);
    }
    public static void concatStringRepeat(String word, int n)
    {
        String result = word.repeat(n);

        System.out.println(result);
    }
    public static void hasOnlySubStrings(String word)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length() / 2; i++)
        {
            //checks if sequence is the same as substring
            //d is not
            //da is not
            //dam is the same sequence
            sb.append(word.charAt(i));
            String resultWord = word.replaceAll(sb.toString(), "");
            if (resultWord.length() == 0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }

    }
}
