package problems.easy.find_closest_value_in_bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindClosestValueInBSTTest {
    // Add, edit, or remove tests in this file.
// Treat it as your playground!

        public TestBST test;

        public FindClosestValueInBSTTest() {
            this.test = new TestBST(100);
            this.test
                    .insert(5)
                    .insert(15)
                    .insert(5)
                    .insert(2)
                    .insert(1)
                    .insert(22)
                    .insert(1)
                    .insert(1)
                    .insert(3)
                    .insert(1)
                    .insert(1)
                    .insert(502)
                    .insert(55000)
                    .insert(204)
                    .insert(205)
                    .insert(207)
                    .insert(206)
                    .insert(208)
                    .insert(203)
                    .insert(-51)
                    .insert(-403)
                    .insert(1001)
                    .insert(57)
                    .insert(60)
                    .insert(4500);
        }

        @Test
        public void TestCase1() {
            assertEquals(FindClosestValueInBST.findClosestValueInBst(this.test, 100), 100);
        }

        @Test
        public void TestCase2() {
            assertEquals(208, FindClosestValueInBST.findClosestValueInBst(this.test, 208));
        }

        @Test
        public void TestCase3() {
            assertEquals(4500, FindClosestValueInBST.findClosestValueInBst(this.test, 4500));
        }

        @Test
        public void TestCase4() {
            assertEquals(4500, FindClosestValueInBST.findClosestValueInBst(this.test, 4501));
        }

        @Test
        public void TestCase5() {
            assertEquals(FindClosestValueInBST.findClosestValueInBst(this.test, -70), -51);
        }

        @Test
        public void TestCase6() {
            assertEquals(1001, FindClosestValueInBST.findClosestValueInBst(this.test, 2000));
        }

        @Test
        public void TestCase7() {
            assertEquals(5, FindClosestValueInBST.findClosestValueInBst(this.test, 6));
        }

        @Test
        public void TestCase8() {
            assertEquals(55000, FindClosestValueInBST.findClosestValueInBst(this.test, 30000));
        }

        @Test
        public void TestCase9() {
            assertEquals(1, FindClosestValueInBST.findClosestValueInBst(this.test, -1));
        }

        @Test
        public void TestCase10() {
            assertEquals(55000, FindClosestValueInBST.findClosestValueInBst(this.test, 29751));
        }

        @Test
        public void TestCase11() {
            assertEquals(4500, FindClosestValueInBST.findClosestValueInBst(this.test, 29749));
        }

        class TestBST extends FindClosestValueInBST.BST {
            public TestBST(int value) {
                super(value);
            }

            public TestBST insert(int value) {
                FindClosestValueInBST.BST current = null;
                if (value < this.value) {
                    if (this.left == null) {
                        this.left = new FindClosestValueInBST.BST(value);
                        return this;
                    } else {
                        current = this.left;
                    }
                } else {
                    if (right == null) {
                        this.right = new FindClosestValueInBST.BST(value);
                        return this;
                    } else {
                        current = this.right;
                    }
                }
                while (true) {
                    if (value < current.value) {
                        if (current.left == null) {
                            current.left = new FindClosestValueInBST.BST(value);
                            return this;
                        } else {
                            current = current.left;
                        }
                    } else {
                        if (current.right == null) {
                            current.right = new FindClosestValueInBST.BST(value);
                            return this;
                        } else {
                            current = current.right;
                        }
                    }
                }
            }
        }

}
