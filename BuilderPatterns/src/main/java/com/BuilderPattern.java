package com;

public class BuilderPattern {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("16GB", "i7")
                                        .setHasGraphicsCard(true)
                                        .setHasWifi(true)
                                        .build();

        System.out.println(computer);
    }
    
}
