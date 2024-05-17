package Chapter_1;

public class characterOccurrences
{
    public static void main(String[] args)
    {
        String word = "annagkzKDfnKJDNFlnFFfmndlaknaldknalknalknakaaaaAAAA";
        getCharOccurrenceCharArray(word, 'k');
        getCharOccurrenceLength(word, 'a');
        getCharOccurrenceLambda(word, 'a');
    }

    public static void getCharOccurrenceLength(String word, char val)
    {
        int count = 0;

        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) == val)
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void getCharOccurrenceCharArray(String word, char val)
    {
        int count = 0;
        for (char ch : word.toCharArray())
        {
            if (ch == val)
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void getCharOccurrenceLambda(String word, char val)
    {
        int count = (int) word.chars()
                .mapToObj(c -> (char) c)
                    .filter(c -> c.equals(val))
                        .count();

        System.out.println("The letter \"" + val + "\" appears " + count + " times in the word \"" + word + "\"");

    }
}
