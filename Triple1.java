import java.util.Scanner;

public class Triple1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int R =sc.nextInt();
        int C = sc.nextInt();

        int [][] num = new int [R][C];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                num[i][j] = sc.nextInt();
            }
        }

        int v =sc.nextInt();

        for(int i=0;i<R;i++){
    
            for(int j=0;j<C-2;j++){
                if(num[i][j]==v && num[i][j+1]==v && num[i][j+2]==v){
                    System.out.print((i+1)+" ");
                    break;
                }
                
            }
        }
    }
}
