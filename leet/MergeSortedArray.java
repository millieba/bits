package leet;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSortedArray {
    /**
     * 
     * @param nums1: Integer array we want to modify and sort in place
     * @param m:     Number of elements in nums1
     * @param nums2  Integer array to merge into nums1
     * @param n:     Number of elements in nums2
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Replace elements in nums1 starting from index m with n elements from nums2
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeandSortDesc1(int[] nums1, int m, int[] nums2, int n) {
        // Replace elements in nums1 starting from index m with n elements from nums2
        System.arraycopy(nums2, 0, nums1, m, n);
        Integer[] nums1Integer = Arrays.stream(nums1).boxed().toArray(Integer[]::new); // Convert int[] to Integer[]
        Arrays.sort(nums1Integer, Comparator.reverseOrder()); // Sort in descending order
        for (int i = 0; i < nums1Integer.length; i++) {
            nums1[i] = nums1Integer[i];
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeandSortDesc2(int[] nums1, int m, int[] nums2, int n) {
        // Replace elements in nums1 starting from index m with n elements from nums2
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        reverse(nums1);

        System.out.println(Arrays.toString(nums1));
    }

    private static void reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int originalLeft = nums[left];
            nums[left] = nums[right];
            nums[right] = originalLeft;
            // Move pointers inward
            left++;
            right--;
        }
    }

    public void merge_LF(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
        mergeandSortDesc2(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
    }
}
