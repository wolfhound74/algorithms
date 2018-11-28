package ru.maslov;

public class ValidPalindrome {

    public static void main(String[] args) {
        new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama".toLowerCase());
//        new ValidPalindrome().isPalindrome("a.".toLowerCase());
//        new ValidPalindrome().isPalindrome("0P".toLowerCase());
//        new ValidPalindrome().isPalindrome(".,".toLowerCase());
//        new ValidPalindrome().isPalindrome("".toLowerCase());
    }

    public boolean isPalindrome(String s) {
        if (s == null) return false;

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        return s.equals(new StringBuffer(s).reverse().toString());
    }
}
