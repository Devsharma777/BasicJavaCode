package dev_sharma777;
interface bicycle{
    int a = 20;
  public   void applyBrake (int decrement);
  public   void speedup (int increment);
}
class AvonCycle implements bicycle{
    void blowhorn(){
        System.out.println("poo poo");
    }
   public void applyBrake(int decrement){
        System.out.println("apply brake");
    }
    public void speedup(int increment){
        System.out.println("apply gear up");
    }
}

public class dev_34_interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(2);
        System.out.println(cycle.a);
    }
}
