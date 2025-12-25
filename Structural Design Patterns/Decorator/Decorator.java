package Decorator;

interface Coffee {
    void make();
}

class SimpleCoffee implements Coffee {
    @Override
    public void make() {
        System.out.print("Coffee");
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; 
    
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    
    public void make(){
       coffee.make();
    }
}

class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee){ super(coffee); }
    
    @Override
    public void make(){
        super.make();
        System.out.print(" with Milk");
    }
}

class Cream extends CoffeeDecorator {
    public Cream(Coffee coffee){ super(coffee); }
    
    @Override
    public void make(){
        super.make();
        System.out.print(" with Cream");
    }
}

class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee){ super(coffee); }
    
    @Override
    public void make(){
        super.make();
        System.out.print(" with Sugar");
    }
}