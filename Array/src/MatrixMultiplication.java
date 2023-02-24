import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int r1 = s.nextInt();
        int c1 = s.nextInt();
        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        int r2 = s.nextInt();
        int c2 = s.nextInt();
        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("Invalid");
        } else {
            int[][] newarr = new int[r1][c2];
            for (int i = 0; i < newarr.length; i++) {
                for (int j = 0; j < newarr[0].length; j++) {
                    for (int k = 0; k < c1; k++) {
                        newarr[i][j] += newarr[i][k] * newarr[k][j];
                    }
                }
            }

            for (int k = 0; k < newarr.length; k++) {
                for (int j = 0; j < newarr[k].length; j++) {
                    System.out.print(newarr[k][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
