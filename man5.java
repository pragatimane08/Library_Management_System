
import java.util.*;
public class man5 {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[3];
    String[] arr2 = new String[3];

    void manage_rec1() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Student Roll no :");
            arr[i] = sc.nextInt();
            System.out.print("Enter Book Name :");
            arr2[i] = sc.next();
        }
    }

    void manage_rec() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Issue Books");
        System.out.println("2.Return Books");
        System.out.println("3.Exit");
        System.out.println("Enter any Option ");
        int opt3 = sc.nextInt();
        switch (opt3) {
            case 1:
                System.out.println("*** Issue Books to student ***");
                manage_rec1();
                System.out.println("Issue Books Successfully ");
                manage_rec();
                break;

            case 2:
                System.out.println("Return Books");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(i + 1 + ">" + arr[i]+""+arr2[i]);
                }
                System.out.println("Return Books Successfully ");
                manage_rec();
                break;

            case 3:
                admin2 obj = new admin2();
                obj.admin2();
                break;
        }
    }

}
