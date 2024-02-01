import java.util.Scanner;

public class Underline1 {
   static void Underline(String name){
        System.out.println(name);
        System.out.println("--------------------");
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=0;i<n;i++){
            String name=sc.next();
            Underline(name);
        }

    }
}
