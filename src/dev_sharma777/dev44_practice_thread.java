package dev_sharma777;

class practice13 extends Thread{
    @Override
    public void run() {
      //  while (true){
            System.out.println("gud morning");
        }
    }

class practice13b extends Thread {
    @Override
    public void run() {
    //    while (false) {
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("welcome");
        }
    }

public class dev44_practice_thread {
    public static void main(String[] args) {
        practice13 p = new practice13();
        p.setPriority(5);
        practice13b p2 = new practice13b();
        p2.setPriority(9);
        System.out.println(p.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        p.start();
        p2.start();
    }
}
