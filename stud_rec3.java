import java.util.*;

class stud_rec3 {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    String[] arr2 = new String[5];

    void stud_rec1() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Roll no :");
            arr[i] = sc.nextInt();
            System.out.print("Enter Name :");
            arr2[i] = sc.next();
        }
    }

    void stud_rec() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add Students");
        System.out.println("2.Display all students");
        System.out.println("3.Exit");
        System.out.println("Enter any Option");
        System.out.println(" ");

        int opt1 = sc.nextInt();
        switch (opt1) {
            case 1:
                System.out.println("add Student Name & Roll_no");
                stud_rec1();
                System.out.println("Data Saved successfully !!");
                stud_rec();
                break;

            case 2:
                System.out.println("List Of student & Roll_no");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(i + 1 + ">" + arr[i] + " " + arr2[i]);
                }
                stud_rec();
                break;

            case 3:
                admin2 obj = new admin2();
                obj.admin2();
                break;
        }
    }
}
