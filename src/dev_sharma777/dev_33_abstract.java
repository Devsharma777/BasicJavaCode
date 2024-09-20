package dev_sharma777;
abstract class base2{
    public base2(){
        System.out.println("i am a constructor of base 2");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void great();
}
class base3 extends base2{
    @Override
    public void great() {
        System.out.println("gud morning");
    }
}
abstract class base4 extends base2{
    public void th(){
        System.out.println("i am gud");
    }
}
public class dev_33_abstract {
    public static void main(String[] args) {
        base3 b = new base3();
    }
}
