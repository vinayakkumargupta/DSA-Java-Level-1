import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i = 0; i<c; i++){
            System.out.println(a);
            int d = a+b;
            a = b;
            b  = d;

        }
    }
}
