import java.util.Scanner;

public class STRINGEXTREMUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=-1;
        int min=1001;
        String ans="";

        sc.nextLine();
        while(true){
            String msg=sc.nextLine();
            int L=msg.length();
            if(L==0){
                break;
            }
            if(n==1&&max<=L){
                max=L;
                ans=msg;
            }
            if(n==2&&L<=min){
                min=L;
                ans=msg;
            }
        }
        if(n==1){
            System.out.println(max);
        }else if(n==2){
            System.out.println(min);
        }
        System.out.println(ans);

    }
    
}
