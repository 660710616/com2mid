import java.util.Scanner;

public class StarBattle {
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

        boolean[][] shotmap = new boolean[R+1][C+1];
        int first = 0;
        int miss = 0;
        int same = 0;
        int misssame = 0;
        int out = 0;

        int K = sc.nextInt();

        for(int i=0 ;i<K; i++){
            int row=sc.nextInt();
            int col=sc.nextInt();
            boolean Row = (1<=row) && (row<=R);
            boolean Col = (1<=col) && (col<=C);

            if(!Row || !Col){
                out++;
                continue;
            }

            boolean map = (num[row][col]==1);
            boolean shot = shotmap[row][col];

            if(map){
                if(!shot){
                    first++;
                    shotmap[row][col]=true;
                }
                else{
                    same++;
                }
            }
            else{
                if(!shot){
                    miss++;
                    shotmap[row][col]=true;
                }
                else{
                    misssame++;
                }

            }

        }

        System.out.println(first);
        System.out.println(miss);
        System.out.println(same);
        System.out.println(misssame);
        System.out.println(out);

    }
}
