import java.util.Scanner;
class Dept{
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int salary;
    int elec;
    int eduCost;

    public Dept(int teacher,int student){
        computeIncome(teacher, student);
        computeExpense(teacher, student);
        System.out.println("total income = "+(ministryBudget+eduFee+serviceFee+donation));
        System.out.println("total expense = "+(salary+elec+eduCost));
        System.out.println("income - expense = "+((ministryBudget+eduFee+serviceFee+donation)-(salary+elec+eduCost)));
    }
    public void computeIncome(int teach,int student){
        this.ministryBudget = (teach*500000)+(student*3000);
        this.eduFee= student*5000;
        this.serviceFee= 300000;
        this.donation =100000;
    }
    public void computeExpense(int teach,int student){
        this.salary = teach*600000;
        this.elec = (teach+student)*2000;
        this.eduCost = student*4000;
    }
    public void printReport(){
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = "+serviceFee);
        System.out.println("donation = "+donation);
        System.out.println("salary = "+salary);
        System.out.println("electricity = "+elec);
        System.out.println("educational cost = "+eduCost);
    }
}

public class department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teacher=sc.nextInt();//n
        int student=sc.nextInt();//k
        Dept d = new Dept(teacher, student);
        d.printReport();
    }
}
