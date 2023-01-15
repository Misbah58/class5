package class5.notes;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* write a program to find the largest number  among three distinct numbers using nested if condition
        please use scanner class to take input  */
       //int number1 , number2 ,   number3;

       /* Scanner scanner= new Scanner(System.in);
        System.out.println("please enter numbers 3 ");
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        int number3= scanner.nextInt();8*/



        int number1 = 5000;
        int number2 = 2000;
        int number3 = 300;
        if (number1 > number2) {
            if (number2 > number3) {
                System.out.println("number is the largest number" + number1);
            }
        }
        if(number2>number1){
            if(number2>number3){
                System.out.println("number is the largest number"+ number2);
            }
        }
        if(number3>number1){
            if(number3>number2){
                System.out.println("number is the largest number"+number3);
            }
        }

    }
}
