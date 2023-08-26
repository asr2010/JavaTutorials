package com;

public class Computer {
    
    //Required Parameters
    private String ram;
    private String cpu;

    //Optional Parameters
    private boolean hasGraphicsCard;
    private boolean hasWifi;

    private Computer(ComputerBuilder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasWifi = builder.hasWifi;

    }
    public static class ComputerBuilder{
        //Required Parameters
        private String ram;
        private String cpu;

        //Optional Parameters
        private boolean hasGraphicsCard;
        private boolean hasWifi;

        public ComputerBuilder(String ram, String cpu){
            this.ram = ram;
            this.cpu = cpu;

        }

        public ComputerBuilder setHasGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public ComputerBuilder setHasWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
    @Override
    public String toString() {
        return "RAM= " + this.ram + ", CPU= " + this.cpu + ", hasGraphicsCard= " + this.hasGraphicsCard + ", hasWifi= " + this.hasWifi;
    }
}
