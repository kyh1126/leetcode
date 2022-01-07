class Solution {
    public boolean isPalindrome(int x) {
        String s = x + "";
        if (s.contains("-")) {
            return false;
        }

        int center = s.length() / 2;
        String sub = s.substring(0, center);
        String reverse = "";

        if (s.length() % 2 == 0) {
            reverse = s.substring(center);
        } else {
            reverse = s.substring(center + 1);
        }
        return !validate(sub, reverse);
    }

    private boolean validate(String sub, String reverse) {
        for (int i = 0; i < sub.length(); i++) {
            if (sub.charAt(i) != reverse.charAt(sub.length() - i - 1)) {
                return true;
            }
        }
        return false;
    }
}