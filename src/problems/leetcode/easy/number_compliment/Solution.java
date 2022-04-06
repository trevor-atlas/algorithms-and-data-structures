package problems.leetcode.easy.number_compliment;

public class Solution {
    public static int findComplement(int num) {
        final var binary = Integer.toBinaryString(num).split("");
        final var result = new String[binary.length];
        for (var i = 0; i < binary.length; i++) {
            final var c = binary[i];
            if (c.equals("1")) {
                result[i] = "0";
            } else {
                result[i] = "1";
            }
        }
        return Integer.parseInt(String.join("", result), 2);


//        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
