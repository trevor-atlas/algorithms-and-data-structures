package problems.udemy_course.arrays.merge_sorted_arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void test1() {
        var a = new int[]{1,2,5,8};
        var b = new int[]{1,2,3,4};
        var result = Solution.mergeSortedArrays(a, b);
        var expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(4);
        expected.add(8);
        assertEquals(expected, result);
    }
}
