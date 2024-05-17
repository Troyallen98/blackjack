package Chapter_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcodeProblems {



    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int pointer = m + n - 1;

        while (pointer1 >= 0 && pointer2 >= 0) {
            if (nums1[pointer1] > nums2[pointer2]) {
                nums1[pointer--] = nums1[pointer1--];

            } else {
                nums1[pointer--] = nums2[pointer2--];
            }
        }
        while (pointer2 >= 0) {
            nums1[pointer--] = nums2[pointer2--];
        }
    }
}
