import java.util.Scanner;

public class NumTable1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R =sc.nextInt();
        int C = sc.nextInt();

        int [][] num = new int [R+1][C+1];

        for(int i=1;i<=R;i++){
            for(int j=1;j<=C;j++){
                num[i][j] = sc.nextInt();
            }
        }
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int r=sc.nextInt();
            int c=sc.nextInt();

            boolean Row = (1<=r) && (r<=R);
            boolean Col = (1<=c) && (c<=C);
            
            if(!Row || !Col){
                System.out.print("-");
            }
            else{
                 
                System.out.print(num[r][c]);
            }
        }
                
            }

        }
    

