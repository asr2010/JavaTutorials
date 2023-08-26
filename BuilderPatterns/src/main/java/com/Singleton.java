package com;
//Singleton Lazy Initialization
public class Singleton 
{

    private static Singleton instance;
    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    private Singleton(){
        
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setVal(100);
        System.out.println("S1 Val before: "+s1.getVal());
        Singleton s2 = Singleton.getInstance();
        s2.setVal(500);    
        System.out.println("S2 val:" + s2.getVal());
        System.out.println("S1 Val after "+s1.getVal());
    }
}
