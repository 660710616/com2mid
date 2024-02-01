

import java.util.Scanner;
class FoodOrder{
    String name;
    int foodTotal;
    int grandtotal;
    int rider=0;
    int grab=0;
    int foodsell=0;
    FoodOrder(String name){
        this.name=name;
    }
    public int addFood(int price){

        foodTotal+=price;
        return foodTotal;
    }
    public void finalizeReceipt(){
        System.out.println(name);
        System.out.println(foodTotal);

        if(foodTotal<50){
            System.out.println("20");
            System.out.println(foodTotal+20);
            grandtotal = foodTotal+20;
        }
        else if(foodTotal>=50&&foodTotal<150){
            System.out.println("10");
            System.out.println(foodTotal+10);
            grandtotal = foodTotal+10;
        }
        else if(foodTotal>=150){
            System.out.println("0");
            System.out.println(foodTotal);
            grandtotal = foodTotal;
        }

    }
    public void distribIncome(){
        if(grandtotal<200){
            rider+=20;
            grab = (grandtotal*3)/10;   
            System.out.println("Rider: "+rider);
            System.out.println("GrabPanda: "+grab);
            foodsell=grandtotal-rider-grab;
            System.out.println("Food Seller: "+foodsell);
            
        }
        else if(grandtotal>=200){
            rider+=30;
            grab = (grandtotal*3)/10;
            System.out.println("Rider: "+rider);
            System.out.println("GrabPanda: "+grab);
            foodsell=grandtotal-rider-grab;
            System.out.println("Food Seller: "+foodsell);
            
        }
        
        


    }


}

public class GrabPanda1 {
    public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 String name = scan.next();
 int N = scan.nextInt();

 FoodOrder order = new FoodOrder(name);
 for(int i = 0; i < N; ++i) {
 int price = scan.nextInt();
 order.addFood(price);
 }
 order.finalizeReceipt();
 order.distribIncome();
 }

    
}
