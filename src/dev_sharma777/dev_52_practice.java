package dev_sharma777;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dev_52_practice {
    public static void main(String[] args) {

//        int n,arm = 0,rem,c;
//        System.out.println("enter any number");
//        Scanner sc = new Scanner(System.in);
//         n= sc.nextInt();
//         c=n;
//         while (n>0){
//            rem = n%10;
//           arm=  (rem*rem*rem)+arm;
//          n=  n/10;
//         }
//         if (c==arm){
//             System.out.println("armstrong number");
//         }
//         else {
//             System.out.println("not armstrong");
//         }
        // problem 2
//        int a = 5;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // problem3
//        int b = 6;
//        for (int i =1; i<=6; i++){
//            for (int j =6;j>i; j--){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // problem4
//        for (int i = 1; i<5; i++){
//            for (int j = 1; j<=5; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
        // problem5
//        int n =4;
//        int m = 5;
//        for (int i =1; i<=4; i++){
//            for (int j =1; j<=5;j++){
//                if(i==1 || j==1 || i== 4 || j ==5){
//                    System.out.print(" * ");
//                }
//                else
//                    System.out.print("   ");
//            }
//            System.out.println();
//        }

//        int x;
//        Scanner SC = new Scanner(System.in);
//        System.out.println(" enter the number");
//        x = SC.nextInt();
//        if(x % 2 == 0){
//            System.out.println(" number is even ");
//        }
//        else{
//            System.out.println("number is odd");
//        }


//      int n , arm =0 , rem , c;
//        System.out.println("enter any number");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        c = n ;
//        while (n>0){
//            rem = n % 10;
//            arm = (rem* rem* rem)+ arm;
//            n = n/10;
//        }
//        if(c == arm ){
//            System.out.println("armstrong");
//        }
//        else
//            System.out.println("not armstrong");

        // problem
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("enter 5 integers");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            int temp = sc.nextInt();

            if( !integers.contains(temp));
            integers.add(temp);
        }
        Collections.sort(integers);
        System.out.println(integers);
    }
}


