package Chapter_1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class anagrams
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter String 1: ");
        String str1 = sc.nextLine();

        System.out.println("Please enter String 2: ");
        String str2 = sc.nextLine();


        if (isAnagram(str1, str2))
            System.out.println("Strings: \""+ str1 + "\" and \"" + str2 + "\" are anagrams.");
        else
            System.out.println("Strings: \""+ str1 + "\" and \"" + str2 + "\" are NOT anagrams.");
    }


    public static boolean isAnagram(String str1, String str2)
    {
        int[]chCount = new int[256];
        char[] chStr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] chStr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        if (chStr2.length != chStr1.length)
        {
            return false;
        }

        for (int i = 0; i < chStr1.length; i++)
        {
            chCount[chStr1[i]]++;
            chCount[chStr2[i]]--;
        }

        for (int i = 0; i < chCount.length; i++)
        {
            if(chCount[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

}
