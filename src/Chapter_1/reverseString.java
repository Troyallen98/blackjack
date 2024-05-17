package Chapter_1;

public class reverseString
{
    public static void main(String[] args)
    {
        String str = "ABCD";
        String rev = "";
        //method 1 using charAt
//        int length = str.length(); //4
//
//        for (int i = length -1; i >= 0; i-- ) //3
//        {
//            rev = rev+str.charAt(i); //D
//        }
//        System.out.println(rev);
//

        //method 2 using charArray
//        char a[]=str.toCharArray();
//        int length = a.length;
//
//        for (int i = length - 1; i >= 0; i--)
//        {
//            rev = rev + a[i];
//        }
//        System.out.println(rev);

        //method  using string buffer class
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
