interface Laptop {
    public void spec();
}

class AppleLaptop implements Laptop {
    public void spec() {
        System.out.println("AppleLaptop");
    }
}

class DellLaptop implements Laptop {
    public void spec() {
        System.out.println("DellLaptop");
    }
}

class HPLaptop implements Laptop {
    public void spec() {
        System.out.println("HPLaptop");
    }
}

class LaptopFactory {
    public Laptop getSpec(String str) {
        if(str.equals("Apple")) return new AppleLaptop();
        if(str.equals("Dell"))  return new DellLaptop();
        else return new HPLaptop();
    }
}

class MainFactory {
    public static void main(String[] args) {
        LaptopFactory lf = new LaptopFactory();
        Laptop lff = lf.getSpec("HP");
        lff.spec();
    }
}
