package Chapter_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class permutationArray {
    public static void main(String[] args) {
        String word = "tset";
        System.out.println("Permutations of the given word are :");
        ArrayList differentWords = new ArrayList<>();
        differentWords.add("NPOQ");
        differentWords.add("test");
        differentWords.add("QOPN");
        differentWords.add("AGRG");
        differentWords.add("GGRA");
        printArrayList(generatePermutation(word), differentWords);
    }

    static void printArrayList(ArrayList<String> combo, ArrayList<String> differentWords) {

        // all permutations of combos
        ArrayList<String> allPermutations = new ArrayList<>(combo);
        //        System.out.print(allPermutations);

        // Adding elements from array1
        Set<String> set1 = new HashSet<>(allPermutations);

        // Adding elements from array2
        Set<String> set2 = new HashSet<>(differentWords);

        // use retainAll() method to find common elements
        set1.retainAll(set2);

        System.out.println("Common elements- " + set1);
    }

    public static ArrayList<String> generatePermutation(String str) {

        if (str.length() == 0) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }

        char ch = str.charAt(0);
        String subStr = str.substring(1);
        ArrayList<String> lastCombination = generatePermutation(subStr);
        ArrayList<String> newCombination = new ArrayList<>();
        for (String val : lastCombination) {
            for (int i = 0; i <= val.length(); i++) {
                newCombination.add(val.substring(0, i) + ch + val.substring(i));
            }
        }
        return newCombination;
    }
}
