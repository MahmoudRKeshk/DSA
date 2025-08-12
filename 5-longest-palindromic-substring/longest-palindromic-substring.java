class Solution {
                  public int lengthOfLastWord(String s) {
        int wordLength = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                wordLength++;
            } else if (wordLength > 0) {
                break;
            }
        }
        return wordLength;
    }

    // babad
    public String longestPalindrome(String s) {
        StringBuilder longestPalindrome = new StringBuilder();
        LinkedList<Character> palindrome = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {
            palindrome.clear();
            palindrome.add(s.charAt(i));

            int leftCenter = i;
            int rightCenter = i;

            while (rightCenter + 1 < s.length() && s.charAt(rightCenter) == s.charAt(rightCenter + 1)) {
                palindrome.add(s.charAt(++rightCenter));
            }

            while (leftCenter - 1 >= 0 && rightCenter + 1 < s.length() && (s.charAt(++rightCenter) == s.charAt(--leftCenter))) {
                palindrome.addFirst(s.charAt(leftCenter));
                palindrome.addLast(s.charAt(rightCenter));
            }

            if (palindrome.size() > longestPalindrome.length()) {
                longestPalindrome.setLength(0);
                palindrome.forEach(longestPalindrome::append);
            }
        }
        return longestPalindrome.toString();
    }
}