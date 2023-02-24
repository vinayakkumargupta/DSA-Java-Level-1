import java.io.*;
public class ok {
    public int maxMul(int z, int x) {
        int mul = z * x;
        return mul;
    }
    // Counstructor Must Return something
    ok(int s, int n){
        System.out.println("Hii this is counstriuctor");
        int div = s/n;
        System.out.println(div);
    }




    void kuShi(int a,int b,int d){
            int c = a+b+d;
            System.out.println(c);

    }

    public static void main(String args[]){
      ok rei = new ok(4,2);
      rei.kuShi(12009878,6,67);
      System.out.println(rei.maxMul(34,35));

      // Public , Private, Protected, Default  (Access Modifier)



    }
}
