package Prctice;

import java.util.Scanner;

public class Solution {


        public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            int n = sc.nextInt();
            int target  = sc.nextInt();

            int [] nums = new int[n];
            for(int i = 0; i<nums.length; i++){
                nums[i] = sc.nextInt();
            }

            for(int j =0; j< nums.length;j++){
                for(int k = 0; k<j; k++){
                    if(nums[k]+nums[j] == target){
                        System.out.println("["+k+","+j+"]");
                    }else{

                    }

                }



        }
    }
}
