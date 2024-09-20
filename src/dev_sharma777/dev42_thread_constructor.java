package dev_sharma777;

class myThr extends Thread{
    public myThr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 34;
        System.out.println("thank you");
    //    while (true){
    //        System.out.println("i am a thread");
        }
    }

public class dev42_thread_constructor {
    public static void main(String[] args) {
        myThr t1 = new myThr("dev");
        myThr t2 = new myThr("har har mahadev");
        t1.start();
        t2.start();
        System.out.println("the name of the thread t is " + t1.getName());
        System.out.println("the id of the thread t is "+ t2.getId());
        System.out.println("the name of the thread t is "+ t2.getName());
        System.out.println("the id of the thread t is "+ t1.getId());
    }
}
