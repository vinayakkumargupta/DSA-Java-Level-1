import java.util.Scanner;

public class input {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name and Number");
        int n = sc.nextInt(); //Integer.parseInt(sc.nextLine)
        String sd = sc.nextLine();
        System.out.println("Your name is " + sd);
        for(int i =0; i<n; i++){
            System.out.println("Hello world");

        }
    }
}
