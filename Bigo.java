

public class Bigo {
    //Dropr Constant
    public static void printItems(int n){
        for(int i =0; i<n;i++){
            System.out.println(i); // The Time Complexity for yhis is n
        }
        for(int j=0;j<n;j++){
            System.out.println(j);// Time Complexity is n
        }
    }
    public static void printO(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.println(i+""+j);
            }
        }
    }
    public static void interView(int a,int b){
        for(int i =0;i<a;i++){
            System.out.println(i);
        }
        for(int j =0; j<b;j++){
            System.out.println(j);
        }

    }
    public static void main(String agrs[]){
       //printItems(10);/Time Complexity is n+n = 2n so drop the constant
      // printO(10);//Time Complexity of this code n*n = n^2
        interView(4,20);//Time Complexity will be O(a+b)

        //Time Complexity will be O(n)
// Interview Question

    }
}
