import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int ans = n%10;
            n = n/10;
            System.out.print(ans);


            if(n == ans){
                System.out.println(true);
            }else{
                System.out.println(false);
            }




        }
    }
}
