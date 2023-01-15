package class5.notes;

import java.util.Scanner;
import java.util.SortedMap;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in) ;

       System.out.println("please enter your age");
        int age = scan.nextInt();

        System.out.println("you are " +age+ " years old");
        System.out.println("please enter your age");
        double weight= scan.nextDouble();
        System.out.println("your weight is "+weight+ "kgs");

        System.out.println("are you hungary");
        boolean hungary= scan.hasNextBoolean();
        System.out.println("hungary" + hungary);

        System.out.println("please enter your gender");
        char gender= scan.next().charAt(0);
        System.out.println("your age is " + age);

        System.out.println("please enter your name");
        String name= scan.next();
        System.out.println("your name is " + name);

         scan.nextLine(); // trick to make next line method work after we used any other method from scanner class
        System.out.println("please enter your full name");
        String fullname= scan.nextLine();
        System.out.println("your full name is "+fullname );
        scan.close();// good practice






    }
}
