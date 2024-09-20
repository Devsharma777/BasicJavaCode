package engineering.digest;

import java.util.Scanner;

public class numberRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , k;
        n = sc.nextInt();
        k = sc.nextInt();
        int Num = n;

        int count = 0;
        while (Num != 0 ) {
            Num = Num / 10;
            count = count + 1;
        }
            k = k % count;
            if(k < 0){
                k = k + count;
            }
            int div = (int)Math.pow(10,k);
            int rem = n % div;
            int q = n / div;
            int remainingDigits = count - k;
            int multiple = (int)Math.pow(10, remainingDigits);
            int res = rem * multiple + q ;
            System.out.println(res);
    }
}


