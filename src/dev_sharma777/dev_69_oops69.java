package dev_sharma777;

class Bank{
    int rateOfIntrest = 20000;
}
class SBI extends Bank{
    int CashBack = 10000;
}
class ICIC extends Bank{
    int fixedDeposite = 30000;
}

public class dev_69_oops69 {
    public static void main(String[] args) {
        SBI S = new SBI();
        ICIC i = new ICIC();
        System.out.println("rate of intrest is :"+S.rateOfIntrest);
        System.out.println("cashback is :"+S.CashBack );
        System.out.println("rate of interst is : "+ i.rateOfIntrest);
        System.out.println("fixed deposite is :"+ i.fixedDeposite);
    }
}
