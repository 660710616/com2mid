import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word = sc.nextLine();
        int n=sc.nextInt();

        if(n<=0||n>word.length()){
            System.out.println("invalid position");
        }
        else{
           char result = word.charAt(n-1);
           System.out.println(result);
        }
    }
}
