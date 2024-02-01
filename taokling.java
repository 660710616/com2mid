class TaoklingOrder{
    int numMilk;
    int numJuice;
    int numMineralWater;
    int total;
    String phoneNo;
    String code;
    boolean completed;

    public  TaoklingOrder(int numMilk,int numJuice,int numMineralWater,String phoneNo,String code){
        this.numMilk = numMilk*10;
        this.numJuice=numJuice*20;
        this.numMineralWater=numMineralWater*15;

        if(phoneNo.length()==10&&phoneNo.charAt(0)==0){
            this.phoneNo = phoneNo;
        }
        
        this.code=code;
        this.completed=false;
    }
    public boolean grabOrder(String phone,String Code){
        if(phone.equals(this.phoneNo)&& code.equals(this.code)){
            return true;
        }
        else{
            return false;
        }
        
    }
    public void printinfo(){
        if(phoneNo.length()==10&&phoneNo.charAt(0)==0){
            System.out.println("0#########");
        }
        else{
            System.out.println("invalid phone number");
        }
        System.out.println(numMilk);
        System.out.println(numJuice);

    }




}
public class taokling {
    
}
