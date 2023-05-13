import java.util.*;

public class admin2 {
    void admin2(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("***Admin Page***");
        System.out.println("1.Student Records");
        System.out.println("2.Book Records");
        System.out.println("3.Manage Books");
        System.out.println("4.Exit ");
        System.out.println("Enter any Option ");
        System.out.println(" ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println("**Student Records**");
                stud_rec3 s = new stud_rec3();
                s.stud_rec();
                break;

            case 2 : 
            System.out.println("**Book Page**");
            book_rec4 obj = new book_rec4();
            obj.book_rec();

            break;
            case 3 : 
            System.out.println("**Manage Books**");
            man5 m5 = new man5();
            m5.manage_rec();
            break;
            case 4 : 
            System.out.println("Exit");
            main1 m2 = new main1();
            m2.log();
            break;
        }
    }
}
