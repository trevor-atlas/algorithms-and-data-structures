package datastructures.BST;

public class Program {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            BST node = this;
            while (true) {
                if (value > node.value) {
                    if (node.right == null) {
                        node.right = new BST(value);
                        break;
                    } else {
                        node = node.right;
                    }
                } else {
                    if (node.left == null) {
                        node.left = new BST(value);
                        break;
                    } else {
                        node = node.left;
                    }
                }
            }
            return this;
        }

        public boolean contains(int value) {
            BST node = this;
            while (node != null) {
                if (node.value > value) {
                     node = node.left;
                } else if (node.value < value) {
                     node = node.right;
                } else {
                    return true;
                }
            }
            return false;
        }

        public BST remove(int value) {
            BST node = this;
            while (node != null) {
                if (node.value > value) {
                    node = node.left;
                } else if (node.value < value) {
                    node = node.right;
                } else {
                    if (node.right != null && node.left != null) {
                        node.value = node.right.findSmallestValue();
                        node.right.remove(node.value);

                    }
                    if (node.right == null && node.left == null) {
                    }
                }
            }
            return this;
        }

        private int findSmallestValue() {
            BST node = this;
            while (true) {
                if (node.left != null) {
                    node = node.left;
                } else {
                    return node.value;
                }
            }
        }
    }
}
