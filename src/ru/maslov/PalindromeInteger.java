package ru.maslov;

public class PalindromeInteger {
    public static void main(String[] args) {
        isPalindrome(12121);
    }

    static boolean isPalindrome(int x) {
        if (x < 0 || x > 0 && x % 10 == 0) {
            return false;
        }

        int secondPart = 0;
        while (x > secondPart) {
            secondPart = secondPart * 10 + x % 10;
            x /= 10;
        }

        return x == secondPart || secondPart / 10 == x;

    }
}
