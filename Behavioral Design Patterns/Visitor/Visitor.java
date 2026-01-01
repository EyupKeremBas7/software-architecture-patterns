interface Printer {
    void print(Computer computer);
    void print(Tablet tablet);
}

class HP implements Printer {
    @Override
    public void print(Computer computer) {
        System.out.println("Printing " + computer.getBrand() + " computer with HP printer...");
    }

    @Override
    public void print(Tablet tablet) {
        System.out.println("Printing " + tablet.getBrand() + " tablet with HP printer...");
    }
}

class Canon implements Printer {
    @Override
    public void print(Computer computer) {
        System.out.println("Printing " + computer.getBrand() + " computer with Canon printer...");
    }

    @Override
    public void print(Tablet tablet) {
        System.out.println("Printing " + tablet.getBrand() + " tablet with Canon printer...");
    }
}

abstract class Electronics {
    private String brand;

    public Electronics(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    abstract void accept(Printer visitor);
}

class Computer extends Electronics {
    public Computer(String brand) {
        super(brand);
    }

    @Override
    public void accept(Printer printer) {
        printer.print(this);
    }
}

class Tablet extends Electronics {
    public Tablet(String brand) {
        super(brand);
    }

    @Override
    public void accept(Printer printer) {
        printer.print(this);
    }
}

