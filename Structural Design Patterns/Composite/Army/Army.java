import java.util.List;
import java.util.ArrayList;

interface Soldier{ void attack(); }

class Private implements Soldier{
    public void attack(){
	System.out.println("Private attack");
    }
}

class Lieutenant implements Soldier{
    private List<Soldier> soldiers;
    public Lieutenant(){
	this.soldiers = new ArrayList<>();
    }

    public void addSoldier(Soldier soldier){
	soldiers.add(soldier);
    }

    public void attack(){
	for(Soldier soldier:soldiers){
	    soldier.attack();
	}
	System.out.println("Lieutenant attack");
    }
}

