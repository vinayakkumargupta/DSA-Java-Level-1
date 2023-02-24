import java.util.Scanner;

public class subarray {
    public static void display(int[]a){
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void subArray(int[]b){
        for(int i = 0;i<b.length;i++){
            for(int j = i;j<b.length;j++ ){
                for(int k = i; k<=j; k++){
                    System.out.print(b[k]);
                }
                System.out.println(" \t");

            }

        }


    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        subArray(arr);
    }
}
