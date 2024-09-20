package dev_sharma777;

class Employees{
    int salary = 40000;
}
class Programmer extends Employees{
    int bonous = 10000;
}
class Developer extends Employees{
    int expenses = 20000;
}
class Programmer2 extends Employees{
    int shares = 50000;
}
class Programmer3 extends Employees{
    int funds = 2000;
}

public class dev_68_oops {
    public static void main(String[] args) {
        Programmer P = new Programmer();
        Developer  D = new Developer();
        Programmer2 p2 = new Programmer2();
        Programmer3 p3 = new Programmer3();
        System.out.println("Programer salary is:"+ P.salary);
        System.out.println("bonus of programer is :"+ P.bonous);
        System.out.println("expense of developer is :" + D.expenses);
        System.out.println("shares of programmer is:"+ p2.shares);
        System.out.println("funds of progreammer is :"+ p3.funds);
    }
}
