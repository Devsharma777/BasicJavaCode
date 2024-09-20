package engineering.digest;

import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
//        int n , count = 0;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//
//        while (n > 0){
//            n = n / 10;
//            count = count + 1;
//        }
//        System.out.println(count);

        int term , a =0 , b =1, c ;
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();

        for (int i =1; i<=term; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
