public class App{
    public static void main(String argv[]){
        Brokerage ibkr = new Brokerage("IBKR");
        Brokerage firstrade = new Brokerage("Firstrade");
    
        Stock nvidia = new Stock("nvda", 188.61);
        nvidia.registerObserver(firstrade);
        nvidia.registerObserver(ibkr);

        nvidia.setQuote(190);

        Stock marti = new Stock("marti", 2.38);
        marti.registerObserver(firstrade);
        marti.registerObserver(ibkr);

        marti.setQuote(3);


    }
}