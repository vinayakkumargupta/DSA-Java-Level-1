import java.util.Scanner;

public class Countdigi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int dig = 0;
        while(a!=0){
            a = a/10;
            dig++;

        }
        System.out.println(dig);
    }
}
