import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update();
}

class People{
    private String name;
    private List<Observer> observers;
    public String getName() {
        return name;
    }
    public People(String name){
        this.name = name;
        observers = new ArrayList<>();
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(getName());
        notifyObserver();
    }



    public void addObserver(Observer o){ observers.add(o); }
    public void notifyObserver(){
        for(Observer o : observers){
            o.update();
        }
    }
} 


class Follower extends People implements Observer{
    public Follower(String name){
        super(name);
    }

    @Override
    public void update() {
        System.out.println();
    }
}
