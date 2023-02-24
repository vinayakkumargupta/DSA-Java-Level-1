public class Binarysearch {
    public static void main(String args[]){
        int [] arr = {10,12,20,30,50,67};
        int data = 12;
        int lower = 0;
        int high = arr.length -1;
        while(lower<=high){
            int medium = ((lower+high)/2);
            if(data<arr[medium]){
                high= medium-1;


            } else if (data>arr[medium]) {
                lower = medium+1;


            }else{
                System.out.println(medium);
                return;
            }
        }
        System.out.println(-1);
    }

}
