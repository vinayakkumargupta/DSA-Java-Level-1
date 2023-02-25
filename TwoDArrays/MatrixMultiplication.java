package TwoDArrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];


        for(int i =0; i<arr1.length;i++){
            for(int j = 0; j<arr1[0].length;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][] arr2 = new int[r2][c2];

        for(int i =0; i<arr2.length;i++){
            for(int j = 0; j<arr2[0].length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        if(r2 != c1){
            System.out.println("Cant be Multiplied");
        }else{
            int[][] arr3 = new int[r1][c2];
            for(int i =0; i<arr3.length;i++){
                for(int j = 0; j<arr3[0].length;j++){
                    for(int k =0; k<r2; k++){
                        arr3[i][j] += arr1[i][k] * arr2[k][j];
                    }

                    }
                }
            for(int i =0; i<arr2.length;i++){
                for(int j = 0; j<arr2[0].length;j++){
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            }


        }
    }
}
