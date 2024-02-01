import java.util.Scanner;

public class Agereport {
    static int report(int [] id,int[]age,int year1 ,int year2){
        int count=0;
        for(int i=0;i<age.length;i++){
            if(age[i]>=year1 && age[i]<=year2){
                System.out.println(id[i]);
                count++;
            }
        }
        return count;
       

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []id = new int[n];
        int [] age = new int[n];
        for(int i=0;i<n;i++){
            id[i] =sc.nextInt();
            age[i] =sc.nextInt();
        }
        int min=sc.nextInt();
        int max=sc.nextInt();
        int re =report(id, age, min, max);
        System.out.println("There are " + re + " persons in age range of "+min+" to "+max);






    }
}
