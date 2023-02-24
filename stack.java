import java.util.Stack;

public class stack {
    public static void main(String args[]){
        Stack<Integer> sc = new Stack<>();
        sc.push(10);
        System.out.println(sc);
        sc.pop();
        System.out.println(sc);
        sc.push(45);
        System.out.println(sc.peek());
    }
}
