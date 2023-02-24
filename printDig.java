import java.util.Scanner;

public class printDig {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = n;

        while(temp != 0){
            temp = temp/10;
            count++;
        }
        int div = (int)Math.pow(10,count-1);
        for(int i = 0; i<count;i++){
            int ans = n/div;
            n = n%div;
            div = div/10;
            System.out.print(ans);
        }

    }
}
