package problems.easy.find_closest_value_in_bst;

public class FindClosestValueInBST {
    public static int walkNode(BST node, int target, int closest) {
        if (node == null) {
            return closest;
        }
        if (Math.abs(target - closest) > Math.abs(target - node.value)) {
            closest = node.value;
        }
        if (target < node.value) {
            return walkNode(node.left, target, closest);
        } else if (target > node.value) {
            return walkNode(node.right, target, closest);
        } else {
            return closest;
        }
    }

    public static int findClosestValueInBst(BST tree, int target) {
        return walkNode(tree, target, Integer.MAX_VALUE-1);
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
