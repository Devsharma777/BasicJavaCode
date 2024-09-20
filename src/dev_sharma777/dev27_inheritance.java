package dev_sharma777;

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printme(){
        System.out.println("i am a constructor");
    }
}
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class animal {
    int a ;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void printmee(){
        System.out.println("i am animal");
    }
}
class  dog extends animal{
    int d ;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}

public class dev27_inheritance {
    public static void main(String[] args) {
//        base b = new base();
//        b.setX(4);
//        System.out.println(b.getX());
//     // creating an object using derived class
//        derived d = new derived();
//        d.setY(32);
//        System.out.println(d.getY());
          animal a = new animal();
          a.setA(88);
        System.out.println(a.getA());

        derived d = new derived();
        d.setY(33);
        System.out.println(d.getY());
    }
}
