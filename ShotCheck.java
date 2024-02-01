import java.util.Scanner;

public class ShotCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int R =sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        
        int in = 0;
        int out = 0 ;

        for(int i=0;i<K;i++){
            int row=sc.nextInt();
            int col=sc.nextInt();
            boolean Row = (1<=row) && (row<=R);
            boolean Col = (1<=col) && (col<=C);

            if(!Row || !Col){
                out++;
            }
            else{
                in++;
            }
        }
        System.out.println(in);
        System.out.println(out);
    }
}
