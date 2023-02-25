package TwoDArrays;

import java.util.Scanner;

public class SearchIN2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] arr =new int[r1][c1];
        for(int i =0; i<arr.length;i++){
            for(int j =0; j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int i =0;
        int j = arr[0].length-1;
        while (i<arr.length && j>=0){
            if(arr[i][j] == target){
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (arr[i][j]>target) {
                j--;
                
            }else {
                i++;
            }
        }
        System.out.println("Not Found");

    }
}
