package jdbcithtest;
import java.util.Scanner;
public class Jdbcithtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("Press 1 for ShowData");
            System.out.println("Press 2 for InsertData");
            System.out.println("Press 3 for update");
            System.out.println("Press 4 for delete");
            System.out.println("Press 5 to Quit\n \n ");
            System.out.println("Make your choice");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    show obj1 =new show();
                    obj1.showdata();
                    break;
                 
                case 2:
                    String un,pd,mob;
                    System.out.println("Enter UserName");
                    un=sc.next();
                    System.out.println("Enter password");
                    pd=sc.next();
                    System.out.println("Enter mob: ");
                    mob=sc.next();
                    insert obj2  = new insert();
                    obj2.insertdata(un,pd,mob);
                    break; 
                case 3:
                    String newpass,oun,opd;
                    System.out.println("enter New Password: ");
                    newpass=sc.next();
                    System.out.println("Enter Username: ");
                    oun=sc.next();
                    System.out.println("enter old password : ");
                    opd=sc.next();
                    update obj3 = new update();
                    obj3.updateData(newpass, oun, opd);
                    break;
                case 4:
                    String una;
                    System.out.println("enter username");
                    una=sc.next();
                    delete obj4 = new delete();
                    obj4.deleteData(una);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
                    
            }
        }  
    }
    
}
