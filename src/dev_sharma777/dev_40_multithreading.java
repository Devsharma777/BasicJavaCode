package dev_sharma777;

class myThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("my thread is running ");
            System.out.println("i am happy");
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("thread2 is good");
            System.out.println("i am sad");
        }
    }
}
public class dev_40_multithreading {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
