// https://leetcode.com/problems/plus-one/description/

package leet._66_plus_one;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int numberOfDigits = digits.length;

        for (int i = numberOfDigits - 1; i >= 0; i--) { // Loop through all digits, right to left (index 0)
            if (digits[i] < 9) { // Once we reach a digit that doesn't need wrapping,
                digits[i]++; // just increment that digit and return digits as is
                System.out.println(Arrays.toString(digits));
                return digits;
            }
            digits[i] = 0;
        }

        // If we still haven't returned anything, that means all digits were 9
        int[] result = new int[numberOfDigits + 1]; // Create a new array with one more digit
        result[0] = 1; // Set the first digit to 1 (carry over)
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int[] plusOneFail1(int[] digits) { // Fails for e.g. {9}, outputs {10}, expected {1, 0}
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        System.out.println(Arrays.toString(digits));

        return digits;

    }

    public static int[] plusOneFail2(int[] digits) { // Fails for e.g. {9, 9}, outputs {9, 1, 0}, expected {1, 0, 0}
        int lastDigit = digits[digits.length - 1];
        if (lastDigit == 9) {
            digits[digits.length - 1] = 1;
            int[] newDigits = Arrays.copyOf(digits, digits.length + 1);
            newDigits[newDigits.length - 1] = 0;
            digits = newDigits;

        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        System.out.println(Arrays.toString(digits));
        return digits;
    }

    public static int[] plusOneFail3(int[] digits) { // Fails for larger arrays, as number becomes e.g.
                                                     // 728509129536673284379577474947011174006
        String numberString = "";
        for (int digit : digits) {
            numberString += digit;
        }
        long resultNumber = Long.parseLong(numberString) + 1;
        String resultString = String.valueOf(resultNumber);
        int[] resultArray = new int[resultString.length()];

        for (int i = 0; i < resultString.length(); i++) {
            resultArray[i] = Character.getNumericValue(resultString.charAt(i));
        }
        System.out.println(Arrays.toString(resultArray));

        return resultArray;
    }

    public static void main(String[] args) {
        plusOne(new int[] { 1, 2, 3 }); // Should output [1,2,4]
        plusOne(new int[] { 9 }); // Should output [1, 0]
        plusOne(new int[] { 9, 9 });
        plusOne(new int[] { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4,
                7, 0, 1, 1, 1, 7, 4, 0, 0, 6 });

    }
}
