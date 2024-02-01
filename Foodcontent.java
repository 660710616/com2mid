import java.util.Scanner;

class Food {
    public String foodname;
    public String add1;
    public int add2;
    public int add3;
    public Food(String fn,String ad1, int ad2, int ad3){
        this.foodname = fn;
        this.add1 = ad1;
        this.add2 = ad2;
        this.add3 = ad3;
        add3 = add3*add2;
    }
    public void printinfo(){
        System.out.println(foodname);
        System.out.println(add2 + " " + add3);
        System.out.println(add1);
    }
    public void addContent(String ad1,int ad2, int ad3){
        add1 += " " + ad1;
        add2 += ad2;
        add3 += ad2*ad3;    
    }
    

}

public class Foodcontent {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String foodName = scan.next();
    	String content1 = scan.next();
    	int w1 = scan.nextInt();
        int w2 = scan.nextInt();
        Food fd = new Food(foodName,content1,w1,w2);
    	int q = scan.nextInt();
		    
	    while(q != 0) {
    	    
	        if(q == 1) {
        		fd.printinfo();
	        }
    	    else if(q == 2) {
                content1 = scan.next();
                w1 = scan.nextInt();
                w2 = scan.nextInt();
    		    fd.addContent(content1, w1, w2);
    	    }
    	    q = scan.nextInt();
	    }
    }
}
