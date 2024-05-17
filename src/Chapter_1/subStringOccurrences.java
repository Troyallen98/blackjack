package Chapter_1;

public class subStringOccurrences
{
    public static void main(String[] args)
    {
        countStringSubstring("hahahahahahahahahahahahahahaaha", "ha");
    }

    public static void countStringSubstring(String words, String wordToFind)
    {
        int position = 0;
        int count = 0;
        int n = wordToFind.length();

        while((position = words.indexOf(wordToFind, position)) != -1)
        {
            position = position + n;
            count++;
        }
        System.out.println(count);
    }
}
