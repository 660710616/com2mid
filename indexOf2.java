import java.util.Scanner;

public class indexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        String key=sc.nextLine();

        if(word.indexOf(key)==-1){
            System.out.println("string not found");
        }
        else{
        for(int i=0;i<word.length();i++){
            if(word.indexOf(key, i)!=word.indexOf(key,i+1)){
                System.out.println(word.indexOf(key)+1+" ");
            }
        }

            //
        }
    }
}
