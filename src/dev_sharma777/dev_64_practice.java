package dev_sharma777;

import java.util.Scanner;

public class dev_64_practice {
    public static void main(String[] args) {
//        int a = 6;
//        int b =  7;
//        System.out.println(a+b);
//    }
        //problem2
//        int number = 40;
//        if (number % 2 == 0) {
//            System.out.println("no is even");
//        } else {
//            System.out.println("no is odd");
//        }
        //problem3
        int n, arm =0, rem, c;
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c=n;
        while (n>0){
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n=n/10;
            if (c==arm){
                System.out.println("armstrong");
            }
            else {
                System.out.println("not armstrong");
            }
        }
    }
}