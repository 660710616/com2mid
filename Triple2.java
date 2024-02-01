import java.util.Scanner;

public class Triple2 {
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

        int last=-1;
        int first=-1;

        for(int i=0;i<R;i++){
            first=-1;
            last=-1;
            for(int j=0;j<C-2;j++){
                if(num[i][j]==v && num[i][j+1]==v && num[i][j+2]==v){
                if(first==-1){
                    first =j+1;
                    last = j+1;

                }else{
                last = j+1;
                }
                    
            }
            
        }
        if(first!=-1 && last!=-1){
            System.out.println(first+" "+last);
        }
        else{
            System.out.println("0");
        }

        }
    }
}

