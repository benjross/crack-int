import java.lang.ArrayIndexOutOfBoundsException;

public class ex3_2 {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(0);
        stack.push(5);
        stack.push(4);
        System.out.println("Should be 0: " + stack.min());
        stack.push(-1);
        System.out.println("Should be -1: " + stack.min());
        System.out.println("Should be -1: " + stack.pop());
        System.out.println("Should be 0: " + stack.min());
        stack.pop();
        stack.pop();
        System.out.println("Should be 0: " + stack.pop());
        System.out.println("Should be 1: " + stack.min());
        System.out.println("Should be 1: " + stack.pop());
    }
}
