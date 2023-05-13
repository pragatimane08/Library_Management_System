import java.util.*;

class book_rec4 {
    Scanner sc = new Scanner(System.in);
    String[] arr2 = new String[3];

    void book_rec1() {
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter Name :");
            arr2[i] = sc.next();
        }
    }

    void book_rec() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Books");
        System.out.println("2.Display all Books");
        System.out.println("3.Exit");
        System.out.println("Enter any Option ");
        int opt3 = sc.nextInt();
        switch (opt3) {
            case 1:
                System.out.println("***Add Books***");
                book_rec1();
                System.out.println("All Books Added successfully !!");
                book_rec();
                break;

            case 2:
                System.out.println("List Of Books Available in Library");
                for (int i = 0; i < arr2.length; i++) {
                    System.out.println(i + 1 + ">" + arr2[i]);
                }
                book_rec();
                System.out.println("");
                break;

            case 3:
                admin2 obj = new admin2();
                obj.admin2();
                break;
        }
    }
}
