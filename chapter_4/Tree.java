public class Tree<T extends Comparable<T>> {
    private class Node<T extends Comparable<T>> {
        Node<T> left, right;
        T data;
        Node(T data) {
            this.data = data;
            left = right = null;
        }
    }

    Node<T> root;

    public Tree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(T item) {
        root = insert(item, root);
    }

    private Node<T> insert(T item, Node<T> node) {
        if (node == null) {
            return new Node<T>(item);
        }
        int res = item.compareTo(node.data);
        if (res == 0 )
            return node;
        else if (res < 0) {
            node.left = insert(item, node.left);
        } else {
            node.right = insert(item, node.right);
        }
        return node;
    }

    public boolean contains(T item) {
        return contains(item, root);
    }

    private boolean contains(T item, Node<T> node) {
        if (node == null) {
            return false;
        }
        int res = node.data.compareTo(item);
        if (res == 0) {
            return true;
        } else if (res < 0) {
            return contains(item, node.left);
        } else {
            return contains(item, node.right);
        }
    }
    public void print() {
        print(root, 0);
    }

    private void print(Node node, int level) {
        for (int i = 0; i < level; i++){
            System.out.print("\t");
        }
        if (node == null)
            System.out.println("-");
        else {
            System.out.println(node.data);
            if (node.left != null || node.right != null) {
                print(node.left, level + 1);
                print(node.right, level + 1);
            }
        }
    }

    public boolean isBalanced() {
        return isBalanced(root) >= 0;
    }

    private int isBalanced(Node node) {
        if (node == null)
            return 0;
        int result = isBalanced(node.left);
        if (result < 0)
            return -1;
        int leftHeight = 1 + isBalanced(node.left);
        result = isBalanced(node.right);
        if (result < 0)
            return -1;
        int rightHeight = 1 + isBalanced(node.right);
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return Math.max(leftHeight, rightHeight);
    }

}
