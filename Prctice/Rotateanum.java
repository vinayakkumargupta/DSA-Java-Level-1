package Prctice;

import java.util.Scanner;

public class Rotateanum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = sc.nextInt();

        int f =couNt(a);

        if(k>0){
            k = k%f;
        }
        if(k<0){
            k = k+f;
        }
        int mul = (int)Math.pow(10,f-k);
        int div = (int)Math.pow(10,k);


        int res = a%div;
        int multiplier = res*mul;
        int q = a/div;
        int ans = q+multiplier;
        System.out.println(ans);
        printNum(ans);
    }
    static int couNt(int a){
        int count =0;
        while(a != 0 ){
            a = a/10;
            count++;
        }
        return count;

    }
    static void printNum(int answer){
        int v = couNt(answer);
        int div2 = (int) Math.pow(10, v - 1);
        while(answer != 0) {
            int quo = answer/div2;
            System.out.println(quo);

            answer = answer%div2;
            div2 = div2/10;


        }

    }
}
