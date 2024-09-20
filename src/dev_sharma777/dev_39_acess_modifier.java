package dev_sharma777;

class  c1{
    public int x = 5;
    protected int y = 6;
    int z = 8;
    private int a = 7;
    public void math1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class dev_39_acess_modifier {
    public static void main(String[] args) {
        c1 c = new c1();
      //  c.math1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
    }
}
