import java.util.Scanner;

public class Processinfo {
    static boolean listprocess(String []name,int[]ram,int used,int N){
        
        int count=0;
        for(int i=0;i<N;i++){
            if(ram[i]>=10){
                System.out.println(name[i]+"* "+ram[i]);
                count+=ram[i];
            }
            else{
                System.out.println(name[i]+" "+ram[i]);
                count+=ram[i];
            }
        }

        System.out.println("RAM used = "+count+" out of "+used);

        if(count>used){
            return false;
        }
        else{
            return true;
        }
        

    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String []name = new String[n];
        int []ram = new int[n];

        for(int i=0;i<n;i++){
            name[i]=sc.next();
            ram[i]=sc.nextInt();
        }
        int use = sc.nextInt();
        if(listprocess(name, ram, use, n)){
            System.out.println("Sufficient RAM");
        }
        else{
            System.out.println("Not enough RAM");
        }



       
    }
}
