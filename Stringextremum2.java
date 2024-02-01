import java.util.Scanner;

public class Stringextremum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ad=sc.nextInt();
        int max=-1;
        int min=1001;
        String ans="";
        sc.nextLine();
        String want1 =sc.nextLine();
        String want2=sc.nextLine();
        while(true){
            String msg=sc.nextLine();
            int L=msg.length();
            if(L==0){
                break;
            }
            boolean found1 =(msg.indexOf(want1)!=-1);
            boolean found2 =(msg.indexOf(want2)!=-1);
            if(!found1&&!found2){
                continue;
            }
            if(ad==1&&max<=L){
                max=L;
                ans=msg;
            }
            if(ad==2&&L<=min){
                min=L;
                ans=msg;
            }
            
        }
        if(ad==1){
            System.out.println(max);
        }else if(ad==2){
            System.out.println(min);
        }
        System.out.println(ans);

    

    }
    
}
