package dev_sharma777;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changenib(){
        System.out.println("changing the nib");
    }
}

class monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("bitting...");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicAnimal{
    void speak(){
        System.out.println("hello sir..");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}


public class dev37_practice_set {
    public static void main(String[] args) {
     // fountainpen fp = new fountainpen();
     // fp.refill();

     //   human dev = new human();
       // dev.sleep();
    //    dev.eat();
      //  dev.jump();

      //  monkey m1= new human();
      //  m1.bite();
     //   basicAnimal lavish = new human();
     //   lavish.sleep();

    }
}
