// https://leetcode.com/problems/length-of-last-word/description/

package leet._58_length_of_last_word;

class LengthOfLastWord {

    public static void lengthOfLastWordWithExtra(String input) {
        String[] words = input.split("\s");

        // Just looping through to see what the split did
        for (String word : words) {
            System.out.println("Word: " + word);
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + words[i]);
        }
        System.out.println(words[words.length - 1].length());
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\s"); // Might not need the trim
        // .length is for arrays, .length() for number of characters in String
        int lastWordLength = words.length > 0 ? words[words.length - 1].length() : 0;

        return lastWordLength;
    }

    public static int lengthOfLastWord_LF(String s) { // More brute force
        s = s.trim();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') { // Stop at first whitespace
                return (s.length() - 1 - i);
            }

        }
        return s.length(); // This only happens if there is only one word
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hey   world   "));
        System.out.println(lengthOfLastWord_LF("hey   world   "));
    }

}