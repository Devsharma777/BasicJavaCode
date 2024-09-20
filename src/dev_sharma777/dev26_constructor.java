package dev_sharma777;

class myMainEmployee{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
    public myMainEmployee(String myName){
        name = myName;
    }
}

public class dev26_constructor {
    public static void main(String[] args) {
   myMainEmployee dev = new myMainEmployee("code with dev");
 //  dev.setName("code with dev");
  // dev.setId(44);
        System.out.println(dev.getId());
        System.out.println(dev.getName());


    }
}
