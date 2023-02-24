import java.util.Scanner;

public class BarGraph {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int max = arr[0];
        for(int i =0; i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        for(int floor = max; floor>=1; floor--){
            for(int i = 0; i< arr.length;i++){
                if(arr[i]>=floor){
                    System.out.println("*\n");
                }else{
                    System.out.println("\t");
                }
            }
        }

    }
}
