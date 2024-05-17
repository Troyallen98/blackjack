package Chapter_1;

public class removeSpace
{
    public static void main(String[] args)
    {
        String whySpace = "lets remove all these spaces";

        String trimmed = whySpace.trim();
        String ugh = whySpace.replace(" ", "");

        System.out.println(ugh);
    }
}
