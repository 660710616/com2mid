import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String key=sc.nextLine();

        if(word.indexOf(key)==-1){
            System.out.println("string not found");
        }
        else{
            System.out.println(word.indexOf(key)+1);
        }

    }
}
 