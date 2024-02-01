import java.util.Scanner;

public class ppap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int i=0;
        while(true){
            i=str.indexOf("PPAP",i);
            int nextPPAP=str.indexOf("PPAP", i+4);
            int nextGOD=str.indexOf("GOD", i+4);
            if(nextPPAP<nextGOD){
                System.out.println(nextPPAP+4);
                break;
            }
            i++;
        }


    }
}
