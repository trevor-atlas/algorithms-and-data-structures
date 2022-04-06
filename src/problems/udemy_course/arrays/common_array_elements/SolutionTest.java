package problems.udemy_course.common_array_elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void test1() {
        var a = new String[]{"a", "b", "x", "y", "z"};
        var b = new String[]{"c", "g", "v", "d", "p"};
        var result = Solution.hasCommonItems(a, b);
        assertFalse(result);
    }

    @Test
    public void test2() {
        var a = new String[]{"a", "b", "x", "y", "z"};
        var b = new String[]{"c", "g", "v", "d", "a"};
        var result = Solution.hasCommonItems(a, b);
        assertTrue(result);
    }

    @Test
    public void test3() {
        var a = new String[]{"a", "b", "c", "x"};
        var b = new String[]{"z", "y", "i"};
        var result = Solution.hasCommonItems(a, b);
        assertFalse(result);
    }

    @Test
    public void test4() {
        var a = new String[]{"a", "b", "c", "x"};
        var b = new String[]{"z", "y", "x"};
        var result = Solution.hasCommonItems(a, b);
        assertTrue(result);
    }

    @Test
    public void test5() {
        var a = new String[]{};
        var b = new String[]{"z", "y", "x"};
        var result = Solution.hasCommonItems(a, b);
        assertFalse(result);
    }

    @Test
    public void test6() {
        var a = new String[]{"z", "y", "x"};
        var b = new String[]{};
        var result = Solution.hasCommonItems(a, b);
        assertFalse(result);
    }

    @Test
    public void test7() {
        var a = new Integer[]{5, 3, 2};
        var b = new Integer[]{1, 6, 9};
        var result = Solution.hasCommonItems(a, b);
        assertFalse(result);
    }

    @Test
    public void test8() {
        var a = new Integer[]{5, 11, 17, 34, 2000};
        var b = new Integer[]{2, 3, 0, -5, 2000};
        var result = Solution.hasCommonItems(a, b);
        assertTrue(result);
    }

    @Test
    public void test9() {
        var a = new Integer[]{};
        var b = new Integer[]{2, 3, 0, -5, 2000};
        var result = Solution.hasCommonItems(a, b);
        assertFalse(result);
    }

    @Test
    public void test10() {
        var a = new Integer[]{5, 44, 23, 1};
        var b = new Integer[]{};
        var result = Solution.hasCommonItems(a, b);
        assertFalse(result);
    }
}
