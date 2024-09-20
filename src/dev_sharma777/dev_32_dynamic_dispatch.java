package dev_sharma777;
class Phone{
    public void great(){
        System.out.println("good morning");
    }

    public void name(){
        System.out.println("turning on phone");
    }
}
class  SmartPhone extends Phone{
    public void swagat(){
        System.out.println("apka swagat hai");
    }
    public void name(){
        System.out.println("turning on smart phone");
    }
}
public class dev_32_dynamic_dispatch {
    public static void main(String[] args) {
      //  phone obj = new phone();
      //  smartPhone sm = new smartPhone();
       // obj.name();

        Phone obj = new SmartPhone();
        obj.great();
        obj.name();
    }
}
