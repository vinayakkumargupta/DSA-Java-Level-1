import java.util.Scanner;



public class BrokenEconomy {

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int [ ] arr = {10,20,30,40,50,60,70};
        int data = sc.nextInt();
        int l = 0;
        int floor = 0;
        int ceil = 0;
        int h = arr.length-1;
        while(l<=h){
            int mid = ((l+h)/2);
            if(data<arr[mid]){
                h = mid-1;
                ceil= arr[mid];


            } else if (data>arr[mid]) {
                l = mid+1;
                floor = arr[mid];

            }
        }System.out.println(ceil);
        System.out.println(floor);
    }
}
