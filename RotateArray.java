import java.util.Scanner;

public class RotateArray {
    public static void reverse(int[] a, int li,int ri){
        while(li<ri){
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;

        }
    }
    public static void display(int[] a){
        for(int i = 0; i<a.length;i++){
            int s = a[i];
            System.out.print(s);
        }
    }
    public static void rotate(int[] a,int k){
        reverse(a,0,a.length-k-1);
        reverse(a,a.length-k, a.length-1);
        reverse(a,0,a.length-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s =sc.nextInt();
        int [] arr = new int[s];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr,k);
        display(arr);

    }


}
