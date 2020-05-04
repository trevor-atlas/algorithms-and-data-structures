package problems.easy.two_number_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public static int[] exec(int[] array, int targetSum) {
        final Map<Integer, Integer> lookup = new HashMap<>();
        for (final int n : array) {
            if (lookup.containsKey(n)) {
                return new int[] { lookup.get(n), n };
            }
            lookup.put(targetSum - n, n);
        }
        return new int[]{};
    }
}
