import java.util.Scanner;

public class ArrayDifference {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr1 = new int[a];
        for(int i =0; i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int [] arr2 = new int[b];

        for(int j = 0; j<arr2.length;j++){
            arr2[j] = sc.nextInt();
        }
        int[]sum = new int[b];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;
        int c = 0;
        while(k>=0){
            int d = 0;
            int a1 = i>=0?arr1[i]:0;
            if(arr2[j]+c > arr1[i]){
               d = arr2[j]+c - a1;
               c = 0;
            }else{
                d = arr2[j]+c+10 - a1;
                c = -1;
            }
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        int id = 0;
        while(id<sum.length){
            if(sum[id] == 0){
                id++;
            }else{
                break;
            }
        }
        while(id<sum.length){
            System.out.println(sum[id]);
            id++;
        }
    }
}
