import java.util.Scanner;

public class BattleMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R =sc.nextInt();
        int C = sc.nextInt();

        int [][] num = new int [R][C];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                num[i][j] = sc.nextInt();
            }
        }

        int K=sc.nextInt();
        System.out.println(K);

         for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

    }
}
