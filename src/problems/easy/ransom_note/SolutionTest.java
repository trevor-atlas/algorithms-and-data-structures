package problems.easy.ransom_note;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void test1() {
        var answer = Solution.canConstruct("", "");
        assertTrue(answer);
    }

    @Test
    public void test2() {
        var answer = Solution.canConstruct("aa", "aab");
        assertTrue(answer);
    }

    @Test
    public void test3() {
        var answer = Solution.canConstruct("aab", "aa");
        assertFalse(answer);
    }

    @Test
    public void test4() {
        var answer = Solution.canConstruct("Hello, World!", "Hello,World!");
        assertFalse(answer);
    }

    @Test
    public void test5() {
        var answer = Solution.canConstruct("Hello, World!", "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%Hello, World!@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        assertTrue(answer);
    }

    @Test
    public void test6() {
        var answer = Solution.canConstruct("Hello, World!", "");
        assertFalse(answer);
    }

    @Test
    public void test7() {
        var answer = Solution.canConstruct("", "Hello, World!");
        assertTrue(answer);
    }
}
