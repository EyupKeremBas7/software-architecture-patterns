import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String ticker,double quote); 
}

interface Subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class Stock implements Subject {
    private String ticker;
    private double quote;
    private List<Observer> observers;
    
    public Stock(String ticker, double quote) {
        this.ticker = ticker;
        this.quote = quote;
        this.observers = new ArrayList<>();
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getQuote() {
        return quote;
    }

    public void setQuote(double quote) {
        this.quote = quote;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(ticker,quote);
        }
    }
}

class Brokerage implements Observer{
    private String name;
    public Brokerage(String name) {
        this.name = name;
    }

    @Override
    public void update(String ticker, double quote) {
        System.out.println(name + " received update for " + ticker + ": " + quote);
    }
}