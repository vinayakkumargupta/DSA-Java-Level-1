import java.util.Scanner;

public class SumofArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        for(int i = 0; i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        for(int j = 0; j<arr2.length;j++){
            arr2 [j] = sc.nextInt();
        }
        int sum[] = new int[a>b?a:b];
        int c = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int  k = sum.length-1;

        while(k>=0){
            int d =c;
            if(i>=0){
                d += arr1[i];
            }
            if(j>=0){
                d += arr2[j];

            }
            sum[k] =d;
            c = d/10;
            d = d%10;
            i--;
            j--;
            k--;

        }
        if(c!=0){
            System.out.println(c);

        }
        for(int val:sum){
            System.out.println(val);

        }


    }
}
