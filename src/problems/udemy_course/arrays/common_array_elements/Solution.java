package problems.udemy_course.common_array_elements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    // O(n) time (n is the length of 'b'), O(m) space (m is the number of unique entries in 'a')
    public static <T> boolean hasCommonItems(final T[] a, final T[] b) {
        final Set<T> lookup = new HashSet<>(Arrays.asList(a));
        for (final T s : b) {
            if (lookup.contains(s)) {
                return true;
            }
        }
        return false;
    }
}
