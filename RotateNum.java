import java.util.Scanner;

public class RotateNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count  = 0;
        int temp = n;
        while( temp!=0) {
            n = n / 10;
            count++;
        }


            //512 k = 1 se rotate krna hai = 215 ana chahiye
            int div = 1;
            int mul = 1;
            for (int i = 0; i <= count; i++) {
                if (i < k) {
                    div = div * 10;

                } else {
                    mul = mul * 10;
                }

            }
            int r = n % div;
            int q = n / div;
            int ans = r * mul + q;
            System.out.println(ans);

        }




}
