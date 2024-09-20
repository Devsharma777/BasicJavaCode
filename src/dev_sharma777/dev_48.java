package dev_sharma777;

import java.util.Scanner;

public class dev_48 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 56;
        marks[1] = 61;
        marks[2] = 62;
        Scanner SC = new Scanner(System.in);

        System.out.println("enter the array index");
        int ind = SC.nextInt();

        System.out.println("enter the number you want to divide the value with");
        int number = SC.nextInt();
        try {
            System.out.println("the value of array index enterded is: " + marks[ind]);
            System.out.println("the value of array value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic exception occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception occured");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("some other   exception occured");
            System.out.println(e);
        }
    }
}
