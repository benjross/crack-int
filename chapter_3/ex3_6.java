public class ex3_6 {

    public static void sortStack(Stack<Integer> s) {
        // maybe just put everything in an array and quicksort?
    }

    public static void main(String[] args) {
        int range = Integer.parseInt(args[0]);
        Stack<Integer> s = new Stack<Integer>();
        Random rand = new Random();
        for (int i = 0; i < range; i++) {
            s.push(rand.randInt());
        }
        s.sort();
        System.out.println(s.toString());
    }
}
