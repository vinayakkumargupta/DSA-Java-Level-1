import java.util.Scanner;

public class Inputnew {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Convert inr to dollar");
        System.out.println("2. Convert Dollar to inr");
        int a = sc.nextInt();
        if(a<3 && a!= 0) {
            System.out.println("Enter Your amount");
            double b = sc.nextDouble();

            switch (a) {
                case 1:
                    double ans = b * 0.012;
                    System.out.println("Your INR to Dollar is " + ans + " Dollar ");
                    break;
                case 2:
                    double ans2 = b * 88.52;
                    System.out.println("Your Dollar to Inr is " + ans2 + " Rupees");
                    break;
                default:
                    System.out.println("Your input is Inccorect\n Try Again Later");
            }
        }else{
            System.out.println("Number is Invalid");
        }










    }
}