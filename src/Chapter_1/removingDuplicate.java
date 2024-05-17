package Chapter_1;

public class removingDuplicate
{
    public static void main(String[] args)
    {
        removeDuplicate("aabbccdejhafaohoahofjajjjj");
        removeDuplicateFor("aabbccdejhafaohoahofjajjjj");
        removeDuplicateFE("ughhhhhh");
    }
    public static void removeDuplicate(String word)
    {
       StringBuilder sb1 = new StringBuilder();
       word.chars().distinct().forEach(c -> sb1.append((char)c));
       System.out.println(sb1);
    }
    public static void removeDuplicateFor(String word)
    {
       StringBuilder sb2 = new StringBuilder();
       for (int i = 0; i < word.length(); i++)
       {
           char ch = word.charAt(i);
           int index = word.indexOf(ch, i + 1);

           if (index == -1)
           {
               sb2.append(ch);
           }
       }
        System.out.println(sb2);
    }
    public static String removeDuplicateFE(String word)
    {
        char[] chArray = word.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch:
             chArray)
        {
            if (sb.indexOf(String.valueOf(ch)) == -1)
            {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


}
