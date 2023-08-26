package com;
//Singleton Eager Initialization
public class Singleton2 
{

    private static final Singleton2 instance = new Singleton2();
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    private Singleton2(){
        
    }

    public static Singleton2 getInstance(){
        return instance;
    }
    

    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        s1.setVal(100);
        System.out.println("S1 Val before: "+s1.getVal());
        Singleton2 s2 = Singleton2.getInstance();
        s2.setVal(500);    
        System.out.println("S2 val:" + s2.getVal());
        System.out.println("S1 Val after "+s1.getVal());
    }
}
