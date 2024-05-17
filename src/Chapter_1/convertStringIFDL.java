package Chapter_1;

public class convertStringIFDL
{
    public static void main(String[] args)
    {
        String str1 = "100";
        String str2 = "100.5";
        String str3 = "100.3333";
        String str4 = "100";

        int num1 = Integer.parseInt(str1);
        double num2 = Double.parseDouble(str2);
        float num3 = Float.parseFloat(str3);
        long num4 = Long.parseLong(str4);
        System.out.println(num3 + 50);
    }
}
