package problems.easy.distinct_in_string_ordered;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void TestCase1() {
        final String result = Solution.findDistinctOrdered("Geeks for Geeks");
        assertEquals(result, "for");
    }

    @Test
    public void TestCase2() {
        final String result = Solution.findDistinctOrdered("Hello Geeks");
        assertEquals(result, "HoGks");
    }

    @Test
    public void TestCase3() {
        final String result = Solution.findDistinctOrdered("racecar");
        assertEquals(result, "e");
    }

    @Test
    public void TestCase4() {
        final String result = Solution.findDistinctOrdered("The Shrike");
        assertEquals(result, "TSrik");
    }
}
