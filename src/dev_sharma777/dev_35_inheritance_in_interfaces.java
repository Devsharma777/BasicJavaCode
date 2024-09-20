package dev_sharma777;
interface samplrinterface{
    void meth1();
    void meth2();
}
interface childsampleInterface extends samplrinterface{
    void meth3();
    void meth4();
        }
   class mysampleclass implements childsampleInterface{
       @Override
       public void meth1() {
           System.out.println("meth1");
       }
           public void meth2() {
           System.out.println("meth2");
       }
       public void meth3() {
           System.out.println("meth3");
       }
       public void meth4() {
           System.out.println("meth4");
       }
   }
public class dev_35_inheritance_in_interfaces {
    public static void main(String[] args) {
        mysampleclass obj= new mysampleclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
