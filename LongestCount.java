import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        String longest = "";
        for(int i=0;i<5;i++){
            String word=sc.nextLine();
            if(word.length()>=max){
                max=word.length();
                longest=word;
            }
        }
        System.out.println(longest);
    }
}
