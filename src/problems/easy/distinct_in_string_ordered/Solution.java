package problems.easy.distinct_in_string_ordered;

import java.util.HashMap;

public class Solution {
    public static String findDistinctOrdered(final String str) {
        final var lookup = new HashMap<Character, Integer>();
        for (var i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') continue;
            lookup.put(
                str.charAt(i),
                lookup.getOrDefault(str.charAt(i), 0)+1
            );
        }

        final var solution = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') continue;
            if (lookup.get(str.charAt(i)) > 1) continue;
            solution.append(str.charAt(i));
        }
        return solution.toString();
    }
}
