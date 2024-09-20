package dev_sharma777;

class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int x){
        System.out.println("i am a constructor with value of x as :" + x);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends base1{
    Derived1(){
     //   super(0);
        System.out.println("i am a overloaded derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("i am a overloaded constructor of derived with value of y as:" + y);
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("i am achild of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println(" i am a overloaded constructor of derived with value z as: " + z);
    }
}

public class dev_29constructor_in_inheritance {
    public static void main(String[] args) {
      //  base1 b = new base1();
      //  Derived1 d = new Derived1();
       // Derived1 d=  new Derived1(14,9);
        ChildOfDerived cd = new ChildOfDerived(14, 16, 18);

    }
}
