import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args){
       Scanner d  = new Scanner(System.in);
       int t = d.nextInt();
       int count = 0;

       for(int i= 0; i<t; i++){
           int n = d.nextInt();
           for(int div = 2; div*div <=n; div++){
               if(n % div ==0){
                   count++;
                   break;
               }
           }
           if(count == 0){
               System.out.println("Number is prime");
           }else{
               System.out.println("Number is not prime");
           }
       }


}
}

