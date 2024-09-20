package dev_sharma777;

class ekClass{
    int a;

    public int getA() {
        return a;
    }

    ekClass(int v){
     this.   a =v;
    }
    public int returnone(){
        return 1;
    }
}
class doclass extends ekClass{
    doclass(int c){
        super(c);
        System.out.println("mai ek constructor hn");
    }
}
public class dev_30_this_super {
    public static void main(String[] args) {
        ekClass e = new ekClass(75);
        System.out.println(e.getA());
        doclass d = new doclass(6);
    }
}
