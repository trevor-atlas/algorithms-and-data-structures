package problems.udemy_course.arrays.merge_sorted_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static List<Integer> mergeSortedArrays(int[] a, int[] b) {
        var result = new ArrayList<Integer>();

        if (a.length < 1 && b.length < 1) return Collections.EMPTY_LIST;
        if (a.length < 1) return Arrays.stream(b).boxed().collect(Collectors.toList());
        if (b.length < 1) return Arrays.stream(a).boxed().collect(Collectors.toList());

        int i = 1;
        int j = 1;
        Integer first = a[0];
        Integer second = a[0];

        while (first != null || second != null) {
            if (second != null && first > second) {
                result.add(first);
                if (i+1 < a.length-1) {
                    i++;
                    first = a[i];
                } else {
                    first = null;
                }
            } else {
                result.add(second);
                if (j+1 < b.length-1) {
                    j++;
                    second = b[j];
                } else {
                    second = null;
                }
            }
        }
        return result;
    }
}
