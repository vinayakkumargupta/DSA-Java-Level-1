package Searching;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int [] arr = new int[n];
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int j =0; j<arr.length;j++){
            if(arr[j] == target ){
                System.out.println(j);
            }
        }
    }
}
