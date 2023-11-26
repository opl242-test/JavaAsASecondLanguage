package io.github.javaasasecondlanguage.lecture01.practice2;

public class Palindrome {
    /**
     * @param str - Nullable string
     * @return True if str is a palindrome
     * 1. Empty string is a palindrome.
     * 2. "aba" is a palindrome.
     * 3. "ab" is not a palindrome.
     * 4. "abA" is not a palindrome.
     * @throws IllegalArgumentException if str is `null`
     */
    public static boolean isPalindrome(String str) {
        // throw new RuntimeException("Not implemented");
        if (str == null) {
            throw new IllegalArgumentException("str could not be null");
        }

        int n = str.length();

        boolean flag = true;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                flag = false;
            }
        }
        
        return flag;
    }
}
