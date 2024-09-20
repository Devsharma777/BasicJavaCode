package dev_sharma777;

import java.util.Scanner;

public class dev_49_nested_try {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 56;
        marks[1] = 61;
        marks[2] = 62;
        Scanner SC = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("enter the value of index");
            int ind = SC.nextInt();

            try {
                System.out.println("welcome to video no 49");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this index does not exist");
                    System.out.println("exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("thanks for using this program");
    }
}
