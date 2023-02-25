package Searching;

import java.util.Scanner;

public class linearsearchintwod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int target = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i =0;i< arr.length;i++){
            for(int j =0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        for(int i =0;i< arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println(i + "," + j);
                }
            }
        }

    }
}
