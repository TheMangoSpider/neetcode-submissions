class Solution {
    public boolean isPalindrome(String s) {
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                s2 += s.charAt(i);
            }
        }
        s2 = s2.toLowerCase();
        System.out.println(s2);
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != s2.charAt(s2.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
