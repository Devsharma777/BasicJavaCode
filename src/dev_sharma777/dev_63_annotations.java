package dev_sharma777;

class NewPhone extends Phone{
public void showTime() {
    System.out.println("time is 8 pm");
}
}
public class dev_63_annotations {
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
    }
}

