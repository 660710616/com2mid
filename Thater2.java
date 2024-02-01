package theater;

import java.util.Scanner;
class Theater{
    boolean threeD;
    boolean luxury;
    int numSeats;
    int seats[];
    String title="";
    int basePrice= 0;

    public Theater(boolean threeD,boolean luxury,int numSeats){
        this.threeD = threeD;
        this.luxury =luxury;
        this.numSeats = numSeats;
        seats = new int [numSeats+1];
    }
    public void setTitle(String movie){
        if(movie == null || movie.length()==0){
            System.out.println("invalid title");
        }
        else{
            title=movie;
        }
    }
    public void setBasePrice(int cheap){
        if(cheap<=0){
            System.out.println("invalid price");
        }
        else{
            basePrice=cheap;
        }

    }
    public void printInfo(){
        //3d
        if(threeD==true){
            System.out.println("3D");
        }
        else{
            System.out.println("No 3D");
        }
        //luxury
        if(luxury==true){
            System.out.println("Luxury");
        }
        else{
            System.out.println("Standard");
        }
        //seat
        System.out.println(seats.length-1);
        //title
        if(title.length()==0){
            System.out.println("title is not set");
        }
        else{
            System.out.println(title);
        }
        //price
        if(basePrice==0){
            System.out.println("price is not set");
        }
        else{
            System.out.println(basePrice);
        }
    }

    public int reserveOne(int seatNumber){
        if(seatNumber<=0 || seatNumber>=seats.length){
            System.out.println("sorry");
            return -1;
        }
        else{
            if(seats[seatNumber]==0){
                seats[seatNumber]++;
                return basePrice;
            }
            else{
                System.out.println("sorry");
                return -1;
            }

        }
    }
    public int reserveMultiple(int numSeats, int seatNumber){
        if(seatNumber<=0 || seatNumber>=seats.length){
            System.out.println("sorry");
            return -1;
        }
        else if(numSeats+seatNumber>seats.length){
            System.out.println("sorry");
            return -1;
        }
        else{
            int count=0;
            for(int i=seatNumber;i<seatNumber+numSeats;i++){
                if(seats[i]==1){
                    System.out.println("sorry");
                    count++;
                    break;
                }
            }
            if(count==1){
                return -1;
            }
            else{
                for(int i=seatNumber;i<numSeats+seatNumber;i++){
                    seats[i]++;
                }
                return numSeats*basePrice;
            }
        }

    }
}

public class Thater2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int threeD1 = scan.nextInt();
    int luxury1 = scan.nextInt();
    int numSeats = scan.nextInt();
    boolean threeD = false;
    boolean luxury = false;
    if(threeD1 == 1)
    threeD = true;
    if(luxury1 == 1)
    luxury = true;
    Theater t = new Theater(threeD, luxury, numSeats);

    String dummy = scan.nextLine(); // throw away new line character
    String title = scan.nextLine();
   t.setTitle(title);

    int basePrice = scan.nextInt();
    t.setBasePrice(basePrice);

    int N = scan.nextInt();
    for(int i = 0; i < N; ++i) {
    int numberOfSeats = scan.nextInt();
    int seatNumber = scan.nextInt();
    int totalPrice;
    if(numberOfSeats == 1)
    totalPrice = t.reserveOne(seatNumber);
    else
    totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
    if(totalPrice > 0)
    System.out.println(totalPrice);
 }

    t.printInfo();
 }

}
