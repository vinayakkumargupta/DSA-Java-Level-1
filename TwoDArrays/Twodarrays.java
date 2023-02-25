package TwoDArrays;

import java.util.Scanner;

public class Twodarrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        for(int i = 0; i<arr.length;i++){
            for(int j =0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print("["+" "+arr[i][j]+"]");
            }
            System.out.println();
        }
    }
}
