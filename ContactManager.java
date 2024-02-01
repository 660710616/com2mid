

import java.util.Scanner;
class ContactBook{
    String[] name ;
    String[] phone;

    public ContactBook(String[]name1,String[]phone1){
        name = name1;
        phone = phone1;
    }
    public void getAllContact(){
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]+" "+phone[i]);
        }
    }
    public void getContact(String contact){
        boolean found = false;
        for(int i=0;i<name.length;i++){
            if(name[i].equals(contact)){
                System.out.println(phone[i]);
                if(!found){
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("Invalid contact");
        }
    }

    static boolean onlyDigits(String phonenum){
        //int count=0;
        for(int i=0;i<phonenum.length();i++){
            Character p = phonenum.charAt(i);
            if(p>='0'&&p<='9'){
                return false;    
            }
        }
        return true;
        
        
        
    }
    public void editNumber(String editname,String editphone){
        boolean check=false;
        boolean number = onlyDigits(editphone) &&editphone.charAt(0)=='0'
        &&editphone.length()==9||editphone.length()==10;

        if(number){
            for(int i=0;i<phone.length;i++){
                if(name[i].equals(editname)){
                    phone[i]=editphone;
                    System.out.println(editname+" new number is "
                    +phone[i]);

                }
                if(!check){
                    check=true;
                }
            }
            if(!check){
                System.out.println("Invalid contact");
            }
        }
        else{
            System.out.println("Invalid number");
        }

     }

}

public class ContactManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String []name = new String[N];
    String []phone = new String[N];

    for(int i=0;i<N;i++){
        name[i]=sc.next();
        phone[i]=sc.next();
    }
    ContactBook book=new ContactBook(name, phone);
    int K=sc.nextInt();
    for(int j=0;j<K;j++){
        int command=sc.nextInt();
        if(command==1){
            String name1=sc.next();
            book.getContact(name1);
        }
        else if(command==2){
            String name2 = sc.next();
            String phone2=sc.next();
            book.editNumber(name2, phone2);

        }
        else if(command==3){
            book.getAllContact();
        }
        else{
            System.out.println("Invalid command");
        }

    }    
}


        
    }
    