class Solution {
    public boolean isPalindrome(String s) {
        String cleanStr = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return new StringBuilder(cleanStr).reverse().toString().equals(cleanStr);
    }
}
