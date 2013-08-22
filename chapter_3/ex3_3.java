import java.lang.ArrayIndexOutOfBoundsException;
public class ex3_3 {
    public static void main(String[] args) {
        int cap = 0, num = 0;
        try {
            cap = Integer.parseInt(args[0]);
            num = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: ex3_3 stack_capacity_num stack_elements_num");
            System.exit(1);
        }
        SetOfStacks s = new SetOfStacks(cap);
        for(int i = 0; i < num; i++) {
            s.push(i);
        }
        //s.secretPrint();
        for(int i = 0; i < num; i++) {
            s.pop();
        }
        System.out.println("pop() works");

        for(int i = 0; i < num; i++) {
            s.push(i);
        }
        //s.secretPrint();
        for (int i = 0; i < num; i++) {
            s.popAt(0);
            //System.out.println("popAt(" + 0 + "):");
            //s.secretPrint();
        }
        System.out.println("popAt() works");
    }
}
