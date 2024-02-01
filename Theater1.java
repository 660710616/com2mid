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

}

public class Theater1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int threeD1 = sc.nextInt();
        int luxury1 = sc.nextInt();
        int numSeats = sc.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if(threeD1 == 1)
        threeD = true;
        if(luxury1 == 1)
        luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = sc.nextLine();// throw away a new line character
        String title = sc.nextLine();
        if(title.compareTo("-1") == 0){
            t.setTitle(null);
        }
        else{
            t.setTitle(title);
        }
       

        int basePrice = sc.nextInt();
        t.setBasePrice(basePrice);
        t.printInfo();

    }
}
