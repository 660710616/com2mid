import java.util.Scanner;

public class SubMatch {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
        String str = sc.nextLine();
        String want = sc.nextLine();
        String keep[] = new String[want.length()-2];
        for(int i=0 ;i<want.length()-2 ;i++){
            keep[i]=want.substring(i,i+3);
        }
        for(int i=0 ;i<want.length()-2 ;i++){
            if(str.indexOf(want.substring(i,3+i))==-1){
                System.out.println("No");
            }
            else{
                System.out.println(str.indexOf(want.substring(i,3+i))+1);
            }
        }        
    }
}