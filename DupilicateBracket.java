import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class DupilicateBracket {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.size() == 0 || st.peek() != '(') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (ch == '}') {
                if (st.size() == 0 || st.peek() != '{') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (ch == ']') {
                if (st.size() == 0 || st.peek() != '[') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else {
                // nothing
            }
        }

        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
