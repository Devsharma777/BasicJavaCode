package dev_sharma777;

class A {
    public int A;
    public int dev(){
        return 4;
    }
    public void method2(){
        System.out.println("i am method 2 of class A");
    }
        }
        class B extends A{
            @Override
            public void method2() {
                System.out.println("i am method 2 of class B");
            }

            public void method3(){
             System.out.println("i am method 3 of class B");
            }
        }

public class dev_31_method_overiding {
    public static void main(String[] args) {
        A a  = new A();
        a.method2();

        B b = new B();
        b.method2();
    }
}
