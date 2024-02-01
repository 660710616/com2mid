import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        char c = sc.next().charAt(0);
        int count=0;
        for(int i=0;i<msg.length();i++){
            if(msg.charAt(i)==c){
                System.out.print(msg.indexOf(c,i)+1 + " ");
                for(int j=i;j<msg.length();j++){
                    System.out.print(msg.charAt(j));
                }

            count++;
            System.out.println();

            }    
        }
        if(count==0){
            System.out.println("not found");
        }
    }
}
