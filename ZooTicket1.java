import java.util.Scanner;

class ZooTicket{
    private String name;
    private boolean ride;
    private boolean seal;
    private boolean tiger;

    ZooTicket(String name){
        this.name=name;
    }
    void bookRide(){
        this.ride=true ;
    }
    void bookSealShow(){
        this.seal=true;
    }
    void bookTigershow(){
        this.tiger=true;
    }

    void summarize(){
        System.out.println(this.name);
        int cost = 100;
        if(this.ride){
            System.out.println("Ride");
            cost+=40;
        }
        if(this.seal){
            System.out.println("Seal");
            cost+=50;
        }
        if(this.tiger){
            System.out.println("Tiger");
            cost+=65;
        }
        System.out.println(cost);
    }
        boolean useRide(){
            if(this.ride){
                this.ride=false;
                System.out.println("okay");
                return true;
            }
            System.out.println("no");
            return false;
        }
        boolean enterSealShow(){
            if(this.seal){
                this.seal=false;
                System.out.println("okay");
                return true;
            }
            System.out.println("no");
            return false;
        }
        boolean enterTigerShow(){
            if(this.tiger){
                this.tiger=false;
                System.out.println("okay");
                return true;
            }
            System.out.println("no");
            return false;
        }



}

public class ZooTicket1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        ZooTicket zoo = new ZooTicket(name);
        int x=sc.nextInt();
        while(x!=0){
            if(x==1){
                zoo.bookRide();
            }
            else if(x==2){
                zoo.bookSealShow();
            }
            else if (x==3){
                zoo.bookTigershow();
            }
            x=sc.nextInt();
        }
        zoo.summarize();;
       

        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int service = sc.nextInt();
            if(service==1){
                System.out.println(zoo.useRide());
            }
            else if(service==2){
                System.out.println(zoo.enterSealShow());
            }
            else if(service==3){
                System.out.println(zoo.enterTigerShow());
            }

        }
        sc.close();


    }
}
