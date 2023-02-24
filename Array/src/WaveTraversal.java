import java.util.Scanner;

public class WaveTraversal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] arr = new int[r1][c1];
        for(int i=0;i<arr.length;i++){
            for(int j =0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }

        }

        for(int j =0; j<arr[0].length;j++){
            if(j% 2 == 0){
                for(int i = 0; i<arr.length;i++){

                    System.out.print(arr[i][j]);
                }
                System.out.println();
                }else {
                for(int i = arr.length - 1; i>= 0; i--){

                    System.out.println(arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}
