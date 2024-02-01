package department;

import java.util.Scanner;

class Dept{
    int ministryBudget,eduFee,serviceFee,donation;

    public Dept(int teacher,int student){
        computeIncome(teacher, student);
    }
    public void computeIncome(int teach,int student){
        this.ministryBudget = (teach*500000)+(student*3000);
        this.eduFee= student*5000;
        this.serviceFee= 300000;
        this.donation =100000;
    }
    public void printReport(){
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+serviceFee);
        System.out.println("donation = "+donation);
    }




}

public class department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teacher=sc.nextInt();//n
        int student=sc.nextInt();//k
        Dept d = new Dept(teacher, student);
        d.printReport();

    }
    
}
