import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String str = sc.next() ;
        int count = 0 ;
        for(int i = 0 ; i < str.length()-2 ; i ++ ){
            int value = (int) str.charAt(i) ;
            int value2 = (int) str.charAt(i+1) ;
            int value3 = (int) str.charAt(i+2) ;
            if(value2 - value == 1 && value3 - value == 2 && 
            value3 - value2 == 1){
                count ++ ;
            }
        }
        System.out.println(count);
    }
    
}
