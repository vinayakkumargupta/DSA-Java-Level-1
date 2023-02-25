package TwoDArrays;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{1,3,4,7,8},{2,9,8,7,6},{0,4,3,2,1}};
        int tne = 4*5;
        int count =0;
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        while(count<tne){
            //lw
            if(count<tne) {
                for (int i = minr, j = minc; i < arr.length; i++) {
                    System.out.print(arr[i][j]);
                    count++;
                }
            }
            minc++;
            //BW
            if(count<tne) {
                for (int i = minc, j = maxr; i < arr[0].length; i++) {
                    System.out.print(arr[j][i]);
                    count++;
                }
            }
            maxr--;
            //RW
            if(count<tne) {
                for (int i = maxr, j = maxc; i >= minr; i--) {
                    System.out.print(arr[i][j]);
                    count++;

                }
            }
            maxc--;
            if(count<tne) {
                for (int i = maxc, j = minr; i >= minc; i--) {
                    System.out.print(arr[j][i]);
                    count++;

                }
            }
            minr++;

        }
    }
}
