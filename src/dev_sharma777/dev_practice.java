package dev_sharma777;

import java.util.Scanner;

public class dev_practice {
    public static void main(String[] args) {
//        // problem 1
//       // int a =7 syntax error
//        int age = 78;
//        int yearborn = 2000-78; // logical error
//        System.out.println(6/0);

        // problem2
//        try{
//            int a = 666/0;
//
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("hehe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("hehe");
//        }

        // problem3
        boolean flag = true;
            int [] marks = new int[3];
            marks[0] = 7;
            marks[1]= 56;
            marks[2] = 6;
        Scanner SC = new Scanner(System.in);
        int index;
        int i =0;
            while (flag && i<5){
                try {
                    System.out.println("enter the value of index");
                    index = SC.nextInt();
                    System.out.println("the value of marks is " + marks[index]);
                    break;
                }
                catch (Exception e) {
                    System.out.println("invalid index");
                    i++;
                }

        }
    }
}
