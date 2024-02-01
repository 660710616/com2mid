import java.util.Scanner;

public class Bgreport {
    static void report(String name,int birth,int start){
        
        if(name.length()>=2){
            System.out.println("Name: "+name);
            if(birth>=1900 && birth<=2022){
                System.out.println("Birth year: "+birth);
                if(start-birth>=18 && start<=2022){
                    System.out.println("Start year: "+start);
                }
                else{
                    System.out.println("Start year: INVALID");
                }
            }
            else{
                System.out.println("Birth year: INVALID");
                System.out.println("Start year: INVALID");
            }
        }
        else if(name.length()<2){
             System.out.println("Name: INVALID");
            if(birth>=1900 && birth<=2022){
                System.out.println("Birth year: "+birth);
                if(start-birth>=18 && start<=2022){
                    System.out.println("Start year: "+start);
                }
                else{
                    System.out.println("Start year: INVALID");
                }
            }
            else{
                System.out.println("Birth year: INVALID");
                System.out.println("Start year: INVALID");
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int birthyear = sc.nextInt();
        int startyear = sc.nextInt();
        report(name, birthyear, startyear);
    }
}
