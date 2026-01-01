public class App {
    public static void main(String[] args) {

        Electronics computer = new Computer("Dell");
        Electronics tablet = new Tablet("Samsung");

        Printer hpPrinter = new HP();
        Printer canonPrinter = new Canon();

        computer.accept(hpPrinter);
        tablet.accept(hpPrinter);

        System.out.println();
        
        computer.accept(canonPrinter);
        tablet.accept(canonPrinter);
    }
}