package dev_sharma777;

class mythreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
        System.out.println("i am a thread1 not a threat");
    }
}
class mythreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("i am bad thread");
        System.out.println("i am bad thread");
        System.out.println("i am bad thread");

    }
}

public class dev41_runnable {
    public static void main(String[] args) {
        myThread1 bullet1 = new myThread1();
        Thread gun1 = new Thread(bullet1);

        myThread2 bullet2 = new myThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
