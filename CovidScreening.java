import java.util.Scanner;

public class CovidScreening {
    static void screencovid(int insurance,int severity,int age,int vaccines){
        if(insurance>0){
            System.out.println("RT-PCR recommended");
        }
        if(age>70 && severity>2){
            System.out.println("Hospital admission");
            if (vaccines<2 || severity>1){
                 System.out.println("Favipiravia included");
            }
            else{
                 System.out.println("Standard medicine package");
            }
        }
        else{
            System.out.println("Home isolation");
              if (vaccines<2 || severity>1){
                 System.out.println("Favipiravia included");
            }
            else{
                 System.out.println("Standard medicine package");
            }

        }
      
        
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int insurance = sc.nextInt();
        int severity = sc.nextInt();
        int age = sc.nextInt();
        int vaccines = sc.nextInt();
        screencovid(insurance, severity, age, vaccines);

    }
}
