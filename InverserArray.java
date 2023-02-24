import java.util.Scanner;

public class InverserArray {
    public static void display(int[]a){
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void inverse(int[] a){
        int [] inv = new int[a.length];
        for(int i = 0;i<a.length;i++){
            int v = a[i];
            inv[v] = i;
            
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int j = 0; j<arr.length;j++){
            arr[j] = sc.nextInt();
        }
        inverse(arr);


    }
}
