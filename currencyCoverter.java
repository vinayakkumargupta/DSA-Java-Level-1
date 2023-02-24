import java.util.Scanner;

public class currencyCoverter {
    public static void main(String args[]){
        System.out.println("Which Currnecy do you want to convert ");
        System.out.println("Press 1 for india Rupees to dollar ");
        System.out.println("Press 2 for USA Dollar to indian rupees");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your currency");
        int a = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();
        switch(a){
            case 1:
                double ans = amount*0.012;
                System.out.println("the amount in ruppee to dollar is "+ ans+" Dollar");
                break;
            case 2:
                double ans2 = amount*82.52;
                System.out.println("The amount dollar  to rupees is " + ans2+" Rupees");
                break;
            default:
                System.out.println("intput is not valid\n Try AGain");
                break;
        }
    }
}
