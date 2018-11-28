package ru.maslov;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    static Integer reverse(Integer x) {

        int res = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;

            if (res > Integer.MAX_VALUE / 10 ) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 ) {
                return 0;
            }

            res = res * 10 + lastDigit;
        }

        return res;
    }
}
