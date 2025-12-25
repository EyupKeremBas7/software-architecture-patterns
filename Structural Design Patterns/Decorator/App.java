package Decorator;

public class App {
    public static void main(String[] args) {
        
        
        Coffee coffee1 = new Sugar(new Milk(new Cream(new SimpleCoffee())));
        coffee1.make();
        System.out.println(); 

        Coffee coffee2 = new Milk(new Cream(new SimpleCoffee()));
        coffee2.make();
        System.out.println();

        Coffee coffee3 = new Cream(new SimpleCoffee());
        coffee3.make();
        System.out.println();
        
        Coffee coffee4 = new SimpleCoffee();
        coffee4.make();
        System.out.println("\n");
    }
}