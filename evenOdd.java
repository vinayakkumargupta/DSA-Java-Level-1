import java.util.Scanner;

public class evenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0){
            if(2<a && 5>a){
                System.out.println("Not weird");
            } else if (6<a && 20>a) {
                System.out.println("Weird");
                
            } else if (a>20) {
                System.out.println("Not Weird");

            }

        }else{
            System.out.println("Weird");
        }
    }
}
