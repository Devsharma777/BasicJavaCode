package dev_sharma777;

class myThr1 extends Thread {
    public myThr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;

        while (i<54666) {
            System.out.println("thank you" + this.getName());
            i++;
        }
    }
}
public class dev43_thread_priorities {
    public static void main(String[] args) {
        myThr1 t1 = new myThr1("dev");
        myThr1 t2 = new myThr1("har har mahadev");
        myThr1 t3 = new myThr1("ram");
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
        

    }
}
