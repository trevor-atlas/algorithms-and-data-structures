package problems.leetcode.easy.number_compliment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void test1() {
        var result = Solution.findComplement(5);
        assertTrue(result == 2);
    }
}
