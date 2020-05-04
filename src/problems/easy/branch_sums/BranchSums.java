package problems.easy.branch_sums;

import java.util.*;

public class BranchSums {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private static void branchSumsHelper(BinaryTree node, int sum, List<Integer> result) {
        if (node == null) {
            return;
        }
        int newSum = sum + node.value;
        if (node.left == null && node.right == null) {
            result.add(newSum);
        }

        branchSumsHelper(node.left, newSum, result);
        branchSumsHelper(node.right, newSum, result);
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> result = new ArrayList<>();
        branchSumsHelper(root, 0, result);
        return result;
    }
}
