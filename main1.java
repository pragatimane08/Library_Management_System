
import java.util.*;
public class main1 {
        void log(){
            Scanner sc = new Scanner(System.in);
        System.out.println("1.Login");
        System.out.println("2.Sign Up!");
        System.out.println("3.Exit!");
        System.out.println("Enter any Option ");
        System.out.println(" ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
            String l3 = sc.nextLine();
                String Login = sc.nextLine();
                String l2 = sc.nextLine();
                String id = "admin";
                String psd = "admin";
                if (Login.equals(id) && l2.equals(psd)) {
                    System.out.println("Login Successfully !!");
                    admin2 a = new admin2();
                    a.admin2();
                    
                } else {
                    System.out.println("Incorrect ID & Password !!");
                }
                break;
            case 2:
                System.out.println("Please Sign Up !");
                break;
            case 3:
                System.out.println("Exit !");
        }
     }
    public static void main(String[] args) {
        main1  m1 = new main1();
        m1.log();
    }
}


