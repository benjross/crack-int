public class ex4_1 {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>();
        tree.print();
        System.out.println("is balanced?: " + tree.isBalanced());
        tree.insert(10);
        tree.print();
        System.out.println("is balanced?: " + tree.isBalanced());
        tree.insert(9);
        tree.print();
        System.out.println("is balanced?: " + tree.isBalanced());
        tree.insert(8);
        tree.print();
        System.out.println("is balanced?: " + tree.isBalanced());
        tree.insert(11);
        tree.print();
        System.out.println("is balanced?: " + tree.isBalanced());
    }
}
