package dev_sharma777;

public class dev_53_finallyblock {
    public static int gread() {
        try {
            int a = 50;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("this is the end of this function");
        }
        return 0;
    }

    public static void main(String[] args) {
       int k= gread();
        System.out.println(k);
        int a = 7;
        int b= 9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("i am finally for value of b = " + b);
                b--;
            }
        }
    }
}