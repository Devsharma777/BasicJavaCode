package dev_sharma777;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

class circle{
    public int radius;
    circle(int a){
        System.out.println("i am a circle");
        this.radius = a;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r, int h){
        super(r);
        System.out.println("i am a cylinder");
        this.height= h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class rectangle{
    public int length, breath;
    rectangle(int l , int b){
        System.out.println("i am a rectangle");
        this.length = l;
        this.breath = b;
    }
    public int area(){
        return this.length*this.breath;
    }
}
class square extends rectangle{
    public int length;
    square(int l, int b){
        super(l,b);
        System.out.println("i am a square ");
        this.length = l;
        this.breath = b;
    }
}




public class dev28_practice {
    public static void main(String[] args) {
        // problem 1
//        int n = 5;
//        for (int i = 5; i>=0;i--){
//            for (int j = 0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // Problem 2
//        int sum =0;
//        int n = 5;
//        for (int i =0;i<=n; i++){
//            sum = sum + (2*1);
//
//        }
//        System.out.print("sum of even number is: ");
//        System.out.println(sum);

        //problem 3
//        int t = 6;
//        for (int i=1; i<=10;i++){
//            for (int j=i; j<=i; j++){
//                System.out.println(t+" x"+ i +" ="+ t*i);
//            }
//        }
        // problem 4
//        int z = 10;
//        for (int i = 1; i<=10; i++){
//            for (int j =10; j>=1; j--){
//                System.out.println(z +" x "+ i +" = "+ z*i);
//            }
//        }
        // problem 5
//        int num = 5;
//        int fact = 1;
//        for (int i = 1; i<=5; i++) {
//            fact = fact * i;
//        }
//            System.out.println(fact);
//
        // problem 6
//        int num = 5;
//        int fact = 1;
//        for (int i = 5; i>= 1;i--){
//            fact = fact *i;
//        }
//        System.out.println(fact);
        // problem 7
//        int n = 5;
//        int factorial = 1;
//        int i = 1;
//        while (i<=n){
//            factorial *= 1;
//            i++ ;
//        }
//        System.out.println(factorial);
        // problem 8
//        for (int i =1; i<=5;i++){
//            for (int j=1; j<+5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // problem 8
//      int a = 0;
//      while(a<6){
//          System.out.println(a);
//          a++;
//      }
        // problem 9
//        int b = 60 ;
//        if (b % 2 == 0){
//            System.out.println("number is even ");
//        }
//        else {
//            System.out.println("no is odd");
//        }
        // problem 10
//        int a = 10;
//        int b = 20;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a "+ a);
//        System.out.println("b "+ b);
        // problem 11
//        int a = 50;
//        int b = 30;
//        int c = 50;
//        if (a>b && a>c){
//            System.out.println("a is grater");
//
//        } else if (b>a && b>c) {
//            System.out.println("b is greater");
//
//        } else if (a==b && b==c && c==a ) {
//            System.out.println("print equal value");
//
//        } else {
//            System.out.println("c is greater");
//        }

        // problem 12
//        int temp = 1;
//        for (int i = 1; i<=100; i++ ){
//            for (int j = 2; j<= i-1; j++){
//            }
//            if (i % 2 == 0){
//                temp = temp + 1;
//            }
//            if (temp ==0){
//                System.out.println(i);
//            }
//            else {
//                temp = 0;
//            }
//        }

        // problem 13
//        int n = 5;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//
//
//        }
        // problem 14
//        int a = 0;
//        int b = 1;
//        int c ;
//        for (int i = 1; i<= 10; i++){
//            c = a+b;
//            System.out.println(c);
//            a = b ;
//            b =c ;
//        }

     // problem 15
//        int year;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the year");
//        year = sc.nextInt();
//        if (year % 400 == 0 ){
//            System.out.println(year +"is a leap year ");
//        }
//        else if (year % 100 == 0){
//            System.out.println(year+"not a leap year");
//        } else if (year % 4== 0) {
//            System.out.println(year+"is a leap year");
//        }
//        else {
//            System.out.println(year+"not a leap year");
//        }
       // problem 16
//       int a = 0;
//       int b= 1;
//       int  c ;
//       for (int i = 1; i<=15; i++){
//           c=a+b;
//           System.out.println(c);
//           a = b;
//           b =c;
//       }
        // problem 17
//        int arr[] = {10,20,30,40,50,60,};
//        System.out.println("content of the array");
//        for (int i = 0;i<5; i++){
//            System.out.println("value of array["+i+"] is " + arr[i]);
//        }
       // problem 18
      //  circle obj = new circle(12);
      //   cylinder objc = new cylinder(12 , 4);

        // problem 19\
     //   rectangle obj = new rectangle(12, 14);
        square obj = new square(15,16);
        }

    }
