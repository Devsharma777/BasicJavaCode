package dev_sharma777;

interface MyCamera2{
    void takeSnap();
    void  recordVideo();
    private void great(){
        System.out.println("good morning");
    }
    default void record4kVideo(){
        great();
        System.out.println("recording in 4k...");
    }
}
interface MyWifi2{
    String[]getNetworks();
    void connectTONetwork(String Network);
}
class MYcellphone2{
    void cellphone(int PhoneNumber) {
        System.out.println("calling "+ PhoneNumber);
    }
    void pickcall(){
        System.out.println("connecting....");
    }
}
 class MySuperPhone2 extends MYcellphone2 implements MyWifi2,MyCamera2{

    public void takeSnap() {System.out.println("taking snap");
    }
    public void recordVideo(){ System.out.println("taking snap");
    }

    public String[] getNetworks() {
        System.out.println("getting list of network");
        String[] Networklist = {"herry", "dev", "anjali234"};
        return Networklist;
    }
    public void connectTONetwork(String Network) {
        System.out.println("connecting to "+ Network);
    }
}
public class dev36_pollymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySuperPhone2();
        cam1.record4kVideo();

        MySuperPhone2 s = new MySuperPhone2();
        s.getNetworks();
        s.recordVideo();
        s.cellphone(956028297);
    }
}
