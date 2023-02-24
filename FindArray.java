import java.util.Scanner;

public class FindArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        int idx = -1;
        int data = sc.nextInt();
        for(int i =0;i< arr.length;i++) {


            if (data == arr[i]) {
                idx = i;
                System.out.println(idx);

            }
        }
        }

    }

