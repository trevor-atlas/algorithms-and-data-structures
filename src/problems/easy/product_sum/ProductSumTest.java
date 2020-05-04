package problems.easy.product_sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductSumTest {
    // Add, edit, or remove tests in this file.
// Treat it as your playground!


    @Test
    public void TestCase1() {
        List<Object> test = new ArrayList<Object>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(15, ProductSum.productSum(test));
    }

    @Test
    public void TestCase2() {
        List<Object> test =
                new ArrayList<Object>(Arrays.asList(1, 2, new ArrayList<Object>(Arrays.asList(3)), 4, 5));
        assertEquals(ProductSum.productSum(test), 18);
    }

    @Test
    public void TestCase3() {
        List<Object> test =
                new ArrayList<Object>(
                        Arrays.asList(
                                new ArrayList<Object>(Arrays.asList(1, 2)),
                                3,
                                new ArrayList<Object>(Arrays.asList(4, 5))));
        assertEquals(ProductSum.productSum(test), 27);
    }

    @Test
    public void TestCase4() {
        List<Object> test = new ArrayList<Object>();
        test.add(
                new ArrayList<Object>(
                        Arrays.asList(
                                new ArrayList<Object>(
                                        Arrays.asList(
                                                new ArrayList<Object>(
                                                        Arrays.asList(new ArrayList<Object>(Arrays.asList(5)))))))));
        assertEquals(ProductSum.productSum(test), 600);
    }

    @Test
    public void TestCase5() {
        List<Object> test =
                new ArrayList<Object>(
                        Arrays.asList(
                                9,
                                new ArrayList<Object>(Arrays.asList(2, -3, 4)),
                                1,
                                new ArrayList<Object>(
                                        Arrays.asList(1, 1, new ArrayList<Object>(Arrays.asList(1, 1, 1)))),
                                new ArrayList<Object>(
                                        Arrays.asList(
                                                new ArrayList<Object>(
                                                        Arrays.asList(
                                                                new ArrayList<Object>(
                                                                        Arrays.asList(new ArrayList<Object>(Arrays.asList(3, 4, 1)))))),
                                                8)),
                                new ArrayList<Object>(
                                        Arrays.asList(1, 2, 3, 4, 5, new ArrayList<Object>(Arrays.asList(6, 7)), -7)),
                                new ArrayList<Object>(
                                        Arrays.asList(
                                                1,
                                                new ArrayList<Object>(
                                                        Arrays.asList(2, 3, new ArrayList<Object>(Arrays.asList(4, 5)))),
                                                new ArrayList<Object>(
                                                        Arrays.asList(6, 0, new ArrayList<Object>(Arrays.asList(7, 0, -8)))),
                                                -7)),
                                new ArrayList<Object>(
                                        Arrays.asList(
                                                1,
                                                -3,
                                                2,
                                                new ArrayList<Object>(
                                                        Arrays.asList(
                                                                1,
                                                                -3,
                                                                2,
                                                                new ArrayList<Object>(Arrays.asList(1, -3, 2)),
                                                                new ArrayList<Object>(
                                                                        Arrays.asList(
                                                                                1,
                                                                                -3,
                                                                                2,
                                                                                new ArrayList<Object>(Arrays.asList(1, -3, 2)),
                                                                                new ArrayList<Object>(Arrays.asList(1, -3, 2)))))))),
                                -3));
        assertEquals(ProductSum.productSum(test), 1351);
    }

    @Test
    public void TestCase6() {
        List<Object> test =
                new ArrayList<Object>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
        assertEquals(ProductSum.productSum(test), 12);
    }
}
