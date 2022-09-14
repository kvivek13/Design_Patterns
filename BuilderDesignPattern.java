/******************************************************************************

                            Builder Design Pattern is used to overcome 
                            the problem of passing all the possible combinations 
                            of mandatory and optional arguments in the constructor 
                            while creating the objects.

*******************************************************************************/

class Phone {
    
    private static String name;
    private static String os;
    private static int ram;
    private static int battery;
    private static double screenSize;
    
    Phone(String name, String os, int ram, int battery, double screenSize) {
        this.name = name;
        this.os = os;
        this.ram = ram;
        this.battery = battery;
        this.screenSize = screenSize;
    }
    
    public void getPhoneDetails() {
        System.out.println("\n Name:" + name + " - OS:" + os + " - RAM:" + ram + " - Battery:" + battery + " - screenSize:" + screenSize);
    }
}


class PhoneBuilder {
    
    private String name;
    private String os;
    private int ram;
    private int battery;
    private double screenSize;
    
    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public PhoneBuilder setOS(String os) {
        this.os = os;
        return this;
    }
    
    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    
    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }
    
    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }
    
    public Phone getPhone() {
        return new Phone(name,os,ram,battery,screenSize);
    }
}

class Main {
    public static void main(String[] args) {
        
        Phone iPhone11 = new PhoneBuilder().setName("iPhone11").setOS("MAC").setRam(256).setBattery(4000).setScreenSize(6.5).getPhone();
        iPhone11.getPhoneDetails();
        
        Phone nokia1600 = new PhoneBuilder().setName("Nokia 1600").setBattery(2000).setScreenSize(2.5).getPhone();
        nokia1600.getPhoneDetails();
    }
}
