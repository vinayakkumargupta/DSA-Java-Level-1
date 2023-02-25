package Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s1 = sc.nextLine();
        System.out.println(s1.length());
        //Char AT



        for(int i = 0; i<s1.length();i++){
            char ch = s1.charAt(i);
            System.out.println(ch);
        }
    }

}
