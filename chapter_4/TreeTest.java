public class TreeTest {
    public static void main(String[] args) {
        Tree<Integer> t = new Tree<Integer>();
        t.insert(10);
        t.insert(5);
        t.insert(12);
        t.insert(7);
        t.print();
    }
}
