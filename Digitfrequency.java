import java.util.Scanner;

public class Digitfrequency {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        while(a!= 0){
            int n = a%10;
            a = a/10;
            if(n == d){
                count++;
            }
        }
        System.out.println(count);

    }
}
