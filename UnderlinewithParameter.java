import java.util.Scanner;

public class UnderlinewithParameter {
    static void Underline(String name,int number){
        System.out.println(name);
        
        for(int i=0;i<number;i++){
            System.out.print("-");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            String name = sc.next();
            int num = sc.nextInt();
            Underline(name, num);
        }
    }
}
