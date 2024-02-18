package leet;

public class Sqrt {

    public static int mySqrt(int x) { // Find square root using binary search
        if (x == 0 || x == 1)
            return x;

        int start = 1;
        int end = x;
        int result = 0;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (mid <= x / mid) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return result;
    }

    public static int mySqrtWithLogging(int x) {
        if (x == 0 || x == 1) {
            return x; // Square root of 0 or 1 is the number itself
        }
        System.out.println("Trying to find square root for " + x);

        int start = 1;
        int end = x;
        int result = 0;

        while (start <= end) { // Perform binary search until start pointer <= end pointer
            System.out.println("End: " + end + ", Start: " + start);
            int mid = start + ((end - start) / 2); // This halves the search range each iteration
            System.out.println("Mid is now at " + mid);

            if (mid <= x / mid) {
                result = mid; // Update the result if mid is less than or equal to the square root
                System.out.println("Potential candidate! " + mid + ". Moving start from " + start + " to " + (mid + 1));
                start = mid + 1;
            } else {
                System.out.println("Mid was too big at " + mid + ". Moving end from " + end + " to " + (mid - 1));
                end = mid - 1;
            }
        }

        System.out.println("######## Closest square root is " + result + "\n");
        return result;
    }

    public static int mySqrtFail1(int x) { // Fails for large numbers especially
        int squareRoot = 0;
        for (int i = 1; i * i <= x; i++) {
            squareRoot = i;
        }

        System.out.println(squareRoot);
        return squareRoot;
    }

    public static void main(String[] args) {
        mySqrtWithLogging(4); // Expected: 2,
        mySqrtWithLogging(8); // Expected: 2, square root of 8 is 2.829 => 2 rounded down
        mySqrtWithLogging(25); // Expected: 5
    }

}
