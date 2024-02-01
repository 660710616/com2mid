import java.util.Scanner;

public class ppap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        String PPAP="PPAP";
        String GOD="GOD";

    if(str.indexOf(PPAP)==-1){
        System.out.println("clean");
    }

    else{
        int firstPPAP = str.indexOf(PPAP);
        int lastPPAP = str.lastIndexOf(PPAP);
            
        int firstGOD = str.indexOf(GOD);
        int lastGOD = str.lastIndexOf(GOD);
            
        boolean left = (firstGOD < firstPPAP);
        boolean right = (lastPPAP < lastGOD);
        if(left&&right){
            System.out.println("safe");
        }else{
            System.out.println("danger");
        }
    }


    }
    
}
