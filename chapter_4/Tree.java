public class Tree<C> {
    private class Node<C> {
        Node<C> left, right;
        C data;
        Node(C data) {
            this.data = data;
            left = right = null;
        }
    }

    Node<C> root;

    public Tree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(C item) {
        if (isEmpty()) {
            root = new Node<C>(item);
        }
        else {
            root = insert(item, root);
        }
    }

    private Node<C> insert(C item, Node<C> node) {
        if (node == null) {
            return new Node<C>(item);
        }
        int res = node.data.compare(item);
        if (res < 0) {
            node.left = insert(item, node.left);
        } else if (res > 0) {
            node.right = insert(item, node.right);
        }
        return node;
    }

    public boolean contains(C item) {
        if (isEmpty()) {
            return false;
        }
        else {
            contains(item, root);
        }
    }

    private boolean contains(C item, Node<C> node) {
        if (node == null) {
            return false;
        }
        int res = node.data.compare(item);
        if (res == 0) {
            return true;
        } else if (res < 0) {
            return contains(item, node.left);
        } else {
            return contains(item, node.right);
        }
    }
}
