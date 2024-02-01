import java.util.Scanner;

public class LongestString4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        int count=0;
        for(;;){
            String word=sc.nextLine();
            if(word.length()==0){
                break;
            }
            else if(word.length()>max){
                max=word.length();
                count=1;
            }
            else if(word.length()==max){
                count++;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
