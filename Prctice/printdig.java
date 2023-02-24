package Prctice;

import java.util.Scanner;

public class printdig {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = counT(a);
        int ans = (int)Math.pow(10,c-1);
        while(a != 0){
            int q = a/ans;
            System.out.print(q);
            a = a%ans;

          ans = ans/10;

        }



         }
    static int counT(int a){
        int count = 0;
        while (a !=0 ){
            a = a/10;
            count++;

        }
        return count;
    }
}
