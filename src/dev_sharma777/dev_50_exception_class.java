package dev_sharma777;

import java.util.Scanner;

class myException extends Exception{
    public String toString() {
        return  "i am tostring()";
    }
    public String getMessage(){
       return   "i am getmessage()" ;
    }
}
public class dev_50_exception_class {
    public static void main(String[] args) {
        int a = 8;
        Scanner SC = new Scanner(System.in);
        a = SC.nextInt();
        if (a < 99) {
            try {
                throw new myException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yers finished");
        }

    }

}
