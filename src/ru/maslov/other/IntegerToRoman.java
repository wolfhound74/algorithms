package ru.maslov.other;

public class IntegerToRoman {
    public static void main(String[] args) {
        new IntegerToRoman().intToRoman(1989);
    }

    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }

    private String getRomanDigit(int n) {
//        switch (n) {
//            case 1:
//                return "I";
//            case 5:
//                return "V";
//            case 10:
//                return "X";
//            case 50:
//                return "L";
//            case 100:
//                return "C";
//            case 500:
//                return "D";
//            case 1000:
//                return "M";
//            default:
//                throw new IllegalArgumentException();
//        }
        return "";
    }

}
