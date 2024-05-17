package Chapter_1;

public class joinStringDelimiter
{
    public static void main(String[] args)
    {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "!";
        String s4 = String.join("AAAA",s1,s2,s3);

        System.out.println(s4);
    }
}
