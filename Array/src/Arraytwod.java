import java.util.Scanner;

public class Arraytwod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][] arr = new int[m][n];
        for(int i =0; i<m;i++){
            for(int j =0; j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int k = 0; k< arr.length;k++){
            for(int j = 0; j<arr[k].length;j++){
                System.out.print(arr[k][j]+" ");
            }
            System.out.println();
        }
    }
}
