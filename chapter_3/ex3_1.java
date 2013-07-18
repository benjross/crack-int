import java.util.EmptyStackException;
import java.lang.IndexOutOfBoundsException;

public class ex3_1 {
    int[] arr;
    int[] tops;

    public ex3_1() {
        arr = new int[30];
        tops = new int[3];
        tops[0] = 0;
        tops[1] = arr.length / 3;
        tops[2] = 2 * (arr.length / 3);
    }

    public void push(int arrayNum, int value) throws IndexOutOfBoundsException {
        if (tops[arrayNum - 1] == (arrayNum + 1) * (arr.length / 3))
            throw new IndexOutOfBoundsException();
        arr[tops[arrayNum - 1]] = value;
        tops[arrayNum - 1]++;
    }

    public int pop(int i) throws EmptyStackException {
        tops[i - 1]--;
        if (tops[i - 1] < (i - 1) * (arr.length / 3))
            throw new EmptyStackException();
        return arr[tops[i - 1]];
    }

    public int peek(int i) { 
        if (tops[i - 1] < (i - 1) * (arr.length / 3))
            throw new EmptyStackException();
        return arr[tops[i - 1] - 1];
    }
		


    public static void main(String[] args) throws Exception {
        ex3_1 e = new ex3_1();
        e.push(1, 0);
        System.out.println("Should be 0: " + e.pop(1)); 
        e.push(2, 0);
        System.out.println("Should be 0: " + e.pop(2)); 
        e.push(3, 0);
        System.out.println("Should be 0: " + e.peek(3)); 
        System.out.println("Should be 0: " + e.pop(3)); 
        for (int i = 0; i < 10; i++) {
            e.push(1, i);
            e.push(2, i + 10);
            e.push(3, i + 20);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(e.pop(3));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(e.pop(2));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(e.pop(1));
        }
    }
}
