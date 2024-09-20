package dev_sharma777;

class negativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "radius cannot be negative";
    }
    public String getmessage(){return "radius cannot be negative: " ;}
}
public class dev_51_throw {
    public static double area(int r) throws negativeRadiusException{
        if (r<0){
            throw  new negativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
      public   static int divide (int a,int b) throws ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
          try {
//              int c = divide(6,0);
//              System.out.println(c);
              double ar = area(6);
          }
          catch (Exception e){
              System.out.println("Exception");
          }

    }
}
