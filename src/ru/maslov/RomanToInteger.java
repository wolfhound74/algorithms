package ru.maslov;

public class RomanToInteger {
    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }


    /*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
    * */
    static int romanToInt(String r) {
        int res = 0;

        char[] arr = r.toCharArray();

        int lastValue = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = getVal(Character.toString(arr[i]));

            lastValue = val < lastValue ? -val : val;

            res += lastValue;
        }

        return res;
    }

    static int getVal(String r) {
        switch (r) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                throw new IllegalArgumentException();
        }
    }
}
